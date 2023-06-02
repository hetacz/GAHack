package com.hetacz.formdemo;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @GetMapping({"/", "index"})
    public String gotoLoginPage() {
        return "index";
    }

    @PostMapping({"/", "index"})
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String surname, @NotNull ModelMap model) {
        model.put("name", name);
        model.put("surname", surname);
        return "success";
    }
}
