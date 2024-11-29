package com.fpttest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.fpttest.dto.Search1Dto;
import com.fpttest.entity.SinhVien;
import com.fpttest.repository.SinhVienRepository;


@Controller
public class Search1Controller {
    private final SinhVienRepository sinhVienRepository;

    public Search1Controller(SinhVienRepository sinhVienRepository) {
        this.sinhVienRepository = sinhVienRepository;
    }

    @GetMapping("/search1")
    public void search1(Model model) {
        model.addAttribute("search1Dto", new Search1Dto());
    }

    @PostMapping("/search1Submit")
    public String postMethodName(@ModelAttribute Search1Dto search1Dto, Model model) {
        SinhVien sinhVien = sinhVienRepository.findById(search1Dto.getSoCmnd()).orElse(null);

        if (sinhVien == null) {
            return "not-found";
        } else {
            model.addAttribute("sinhVien", sinhVien);
            return "search1-result";
        }
    }
}
