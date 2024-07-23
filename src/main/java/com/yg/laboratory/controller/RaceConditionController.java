package com.yg.laboratory.controller;

import com.yg.laboratory.util.Home;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RaceConditionController {

    @GetMapping("/race-condition")
    public String raceCondition(Model model){
        model.addAttribute("title", Home.BLOG_TITLE);
        model.addAttribute("")

        return "race-condition";
    }

}
