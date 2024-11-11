package com.yg.laboratory.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CategoryDTO {

    private String name;
    private String parentName;

}
