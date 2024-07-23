package com.yg.laboratory.dao;

import lombok.Builder;

public record BoardDto(
        Long id,
        String name,
        String url
) {
    @Builder
    public BoardDto{}
}
