package com.fpttest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.fpttest.dto.Search2Dto;
import com.fpttest.entity.CongViec;
import com.fpttest.entity.SinhVien;
import com.fpttest.entity.TotNghiep;
import com.fpttest.repository.CongViecRepository;
import com.fpttest.repository.SinhVienRepository;
import com.fpttest.repository.TotNghiepRepository;

@Controller
public class Search2Controller {
    private final TotNghiepRepository totNghiepRepository;
    private final CongViecRepository congViecRepository;
    private final SinhVienRepository sinhVienRepository;

    public Search2Controller(TotNghiepRepository totNghiepRepository,
            CongViecRepository congViecRepository, SinhVienRepository sinhVienRepository) {
        this.totNghiepRepository = totNghiepRepository;
        this.congViecRepository = congViecRepository;
        this.sinhVienRepository = sinhVienRepository;
    }

    @GetMapping("/search2")
    public void search2(Model model) {
        model.addAttribute("search2Dto", new Search2Dto());
    }

    @PostMapping("/search2Submit")
    public String search2Submit(@ModelAttribute Search2Dto search2Dto, Model model) {
        SinhVien sinhVien = sinhVienRepository.findById(search2Dto.getSoCmnd()).orElse(null);

        if (sinhVien == null) {
            return "not-found";
        } else {
            TotNghiep totNghiep = totNghiepRepository.findBySinhVien(sinhVien).get();
            CongViec congViec = congViecRepository.findBySinhVien(sinhVien).get();

            model.addAttribute("sinhVien", sinhVien);
            model.addAttribute("totNghiep", totNghiep);
            model.addAttribute("congViec", congViec);

            return "search2-result";
        }
    }

}
