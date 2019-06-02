package com.suvankarmitra.ui.controller;

import com.suvankarmitra.utils.HtmlUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/source")
    public String loadHome(Model model) {
        String code = "Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list, compares adjacent pairs and swaps them if they are in the wrong order ...";
        String html = HtmlUtil.textToHTML(code);
        model.addAttribute("body", html);
        return "home";
    }

    @GetMapping("/source/write")
    public String oadWriter(Model model) {
        return "editor";
    }
}
