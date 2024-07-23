package com.yg.laboratory.controller;

import com.yg.laboratory.util.Home;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", Home.BLOG_TITLE);
        model.addAttribute("description", Home.BLOG_DESCRIPTION);

        // 게시판 목록 추가
        List<String> boards = Arrays.asList("뚝딱뚝딱", "만드는 중", "조금만", "기다려주세요");
        model.addAttribute("boards", boards);
        return "home";
    }
}
