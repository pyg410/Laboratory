package com.yg.laboratory.controller;

import com.yg.laboratory.dao.BoardDto;
import com.yg.laboratory.service.BoardService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

@WebMvcTest(BoardController.class)
public class BoardControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BoardService boardService;

    @Test
    public void board_template_test() throws Exception {
        // Arrange
        Mockito.when(boardService.getBoardList()).thenReturn(
                List.of(BoardDto.builder().id(1L).name("홈").url("").build(),BoardDto.builder().id(2L).name("게시판").url("boards").build())
        );

        // Act & Assert
        mockMvc.perform(MockMvcRequestBuilders.get("/boards"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/html;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.xpath("//title").string("CODE LABORATORY"))
                .andExpect(MockMvcResultMatchers.xpath("//h1/a").string("CODE LABORATORY"))
                .andExpect(MockMvcResultMatchers.xpath("//ul[@class='boards-list']/li[1]/a").string("홈"))
                .andExpect(MockMvcResultMatchers.xpath("//ul[@class='boards-list']/li[2]/a").string("게시판"))
                .andExpect(MockMvcResultMatchers.xpath("//p").string("© 2024 YG's laboratory"));
    }



}
