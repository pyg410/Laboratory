package com.yg.laboratory.service;

import com.yg.laboratory.dao.BoardDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    public List<BoardDto>  getBoardList(){
        return List.of(BoardDto.builder().id(1L).name("홈").url("").build(),BoardDto.builder().id(2L).name("게시판").url("boards").build());
    }

}
