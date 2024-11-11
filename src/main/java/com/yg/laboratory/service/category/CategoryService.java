package com.yg.laboratory.service.category;

import com.yg.laboratory.dto.CategoryDTO;
import com.yg.laboratory.dto.RequestDTO;
import com.yg.laboratory.dto.ResponseDTO;

public interface CategoryService {

    ResponseDTO<CategoryDTO>  createCategory(RequestDTO<CategoryDTO> requestDTO);
    ResponseDTO<CategoryDTO> deleteCategory(RequestDTO<CategoryDTO> requestDTO);
}
