package com.fpttest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Search2Controller {
    @GetMapping("/search2")
    public void search2(Model model) {}

}
