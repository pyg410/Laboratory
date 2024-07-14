package com.yg.laboratory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    private static final String BLOG_TITLE = "Code Laboratory";

    private static final String BLOG_DESCRIPTION = "이것저것 재밌는 코딩 실험을 하는 자유로운 공간입니다.";

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", BLOG_TITLE);
        model.addAttribute("description", BLOG_DESCRIPTION);

        // 게시판 목록 추가
        List<String> boards = Arrays.asList("뚝딱뚝딱", "만드는 중", "조금만", "기다려주세요");
        model.addAttribute("boards", boards);
        return "home";
    }
}
