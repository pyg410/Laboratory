package com.yg.laboratory.controller;

import com.yg.laboratory.dao.BoardDto;
import com.yg.laboratory.service.BoardService;
import com.yg.laboratory.util.Home;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final BoardService boardService;


    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", Home.BLOG_TITLE);
        model.addAttribute("description", Home.BLOG_DESCRIPTION);

        // 게시판 목록 추가

        List<BoardDto> boards = boardService.getBoardList();
        model.addAttribute("boards", boards);
        return "home";
    }
}
