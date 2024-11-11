package com.yg.laboratory.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class RequestDTO<T> {

    private T requestDTO;
}
