package com.exmple.controller;

import com.exmple.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertMoneyController {

    @Autowired
    private IConvertService convertService;

    @GetMapping("/")
    public String home() {
        return "convert";
    }

    @PostMapping("")
    public String currencyConvert( @RequestParam double usd, Model model) {
        Double result = convertService.value(usd);
        model.addAttribute("result", result);
        model.addAttribute("usd", usd);
        return "convert";
    }
}
