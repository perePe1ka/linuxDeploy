package ru.vladuss.adminka_linux.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPage {
    @GetMapping("/")
    public String mainPage() {
        return "MainPage";
    }


}
