package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("msg", "test");

        return "top/index";
    }
}
