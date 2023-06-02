package com.hetacz.formdemo;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OKController {

    @GetMapping("success")
    public String arrive(@NotNull ModelMap model) {
        model.put("name", model.get("name"));
        model.put("username", model.get("username"));
        return "success";
    }
}
