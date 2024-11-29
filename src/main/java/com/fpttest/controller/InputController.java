package com.fpttest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.fpttest.dto.InputDto;
import com.fpttest.entity.Nganh;
import com.fpttest.entity.SinhVien;
import com.fpttest.entity.TotNghiep;
import com.fpttest.entity.Truong;
import com.fpttest.repository.NganhRepository;
import com.fpttest.repository.SinhVienRepository;
import com.fpttest.repository.TotNghiepRepository;
import com.fpttest.repository.TruongRepository;

@Controller
public class InputController {
    private final TruongRepository truongRepository;
    private final NganhRepository nganhRepository;
    private final SinhVienRepository sinhVienRepository;
    private final TotNghiepRepository totNghiepRepository;

    public InputController(TruongRepository truongRepository, NganhRepository nganhRepository,
            SinhVienRepository sinhVienRepository, TotNghiepRepository totNghiepRepository) {
        this.truongRepository = truongRepository;
        this.nganhRepository = nganhRepository;
        this.sinhVienRepository = sinhVienRepository;
        this.totNghiepRepository = totNghiepRepository;
    }

    @GetMapping("/input")
    public void input(Model model) {
        model.addAttribute("inputDto", new InputDto());
        model.addAttribute("truongItems", truongRepository.findAll());
        model.addAttribute("nganhItems", nganhRepository.findAll());
    }

    @PostMapping(value = "/input")
    public String input(@ModelAttribute InputDto inputDto, Model model) {
        SinhVien sinhVien = new SinhVien(inputDto.getSoCmnd(), inputDto.getHoTen(),
                inputDto.getEmail(), inputDto.getSoDt(), inputDto.getDiaChi());
        Truong truong = Truong.builder().maTruong(inputDto.getMaTruong()).build();
        Nganh nganh = Nganh.builder().maNganh(inputDto.getMaNganh()).build();
        TotNghiep totNghiep = new TotNghiep(null, inputDto.getHeTotNghiep(),
                inputDto.getNgayTotNghiep(), inputDto.getLoaiTotNghiep(), sinhVien, truong, nganh);

        sinhVienRepository.save(sinhVien);
        totNghiepRepository.save(totNghiep);

        model.addAttribute("message", "User submitted successfully!");
        return "result";
    }
}
