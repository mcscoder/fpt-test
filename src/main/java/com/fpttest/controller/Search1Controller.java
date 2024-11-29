package com.fpttest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Search1Controller {
    @GetMapping("/search1")
    public void search1(Model model) {}
}
