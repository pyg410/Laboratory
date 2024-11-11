package com.yg.laboratory.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ResponseDTO<T> {

    private T responseDTO;

    private String resMessage;
    private String resCode;

    @Builder
    public ResponseDTO(String resCode, String resMessage, T responseDTO){
        this.resCode=resCode;
        this.resMessage =resMessage;
        this.responseDTO = responseDTO;
    }
}
