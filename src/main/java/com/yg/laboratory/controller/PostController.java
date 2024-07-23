package com.yg.laboratory.controller;

import com.yg.laboratory.util.Home;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PostController {

    @GetMapping("/post/{id}")
    public String posts(Model model,
                        @PathVariable Long id){
        model.addAttribute("title", Home.BLOG_TITLE);


        return "posts";
    }
}
