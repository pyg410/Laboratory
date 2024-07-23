package com.yg.laboratory.controller;

import com.yg.laboratory.dao.BoardDto;
import com.yg.laboratory.domain.Post;
import com.yg.laboratory.util.Home;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class RaceConditionController {

    @GetMapping("/race-condition")
    public String raceCondition(Model model){
        model.addAttribute("title", Home.BLOG_TITLE);
        model.addAttribute("");

        return "race-condition";
    }

    @GetMapping("/boards")
    public String boards(Model model,
                         @RequestParam(defaultValue = "1") int page){
        model.addAttribute("title", Home.BLOG_TITLE);
        List<BoardDto> boards = Collections.singletonList(BoardDto.builder().id(1L).name("게시판").build());
        model.addAttribute("boards", boards);


        List<Post> posts = new ArrayList<>();
        posts.add(new Post("id1", "게시글1"));
        posts.add(new Post("id1", "게시글2"));
        posts.add(new Post("id1", "게시글3"));
        model.addAttribute("posts", posts);

        int pageSize = 5;
        Pageable pageable = PageRequest.of(page - 1, pageSize);
        Page<Post> postPage = new PageImpl<>(posts, pageable, (long) pageSize);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", postPage.getTotalPages());

        return "boards";
    }

}