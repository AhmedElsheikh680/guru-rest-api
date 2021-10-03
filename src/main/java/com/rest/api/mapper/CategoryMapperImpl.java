package com.rest.api.mapper;

import com.rest.api.domain.Category;
import com.rest.api.dto.CategoryDTO;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapperImpl implements CategoryMapper{
    @Override
    public CategoryDTO categoryToCtegoryDTO(Category category) {
        if(category == null){
            return null;
        }
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        return categoryDTO;
    }
}
