package com.yg.laboratory.service.category;

import com.yg.laboratory.domain.Category;
import com.yg.laboratory.dto.CategoryDTO;
import com.yg.laboratory.dto.RequestDTO;
import com.yg.laboratory.dto.ResponseDTO;
import com.yg.laboratory.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    @Override
    @Transactional
    public ResponseDTO<CategoryDTO> createCategory(RequestDTO<CategoryDTO> requestDTO) {

        CategoryDTO dto = requestDTO.getRequestDTO();
        categoryRepository.save(
                Category.to(
                        dto,
                        categoryRepository.findByName(dto.getName())
                                .orElseThrow(() -> new RuntimeException("createCategory Method, findByName 실행도중 카테고리를 찾을 수 없습니다."))
                )
        );
        return ResponseDTO.<CategoryDTO>builder()
                .resCode("0000")
                .resMessage("성공")
                .responseDTO(requestDTO.getRequestDTO())
                .build();
    }

    @Override
    public ResponseDTO<CategoryDTO> deleteCategory(RequestDTO<CategoryDTO> requestDTO) {
        return null;
    }
}
