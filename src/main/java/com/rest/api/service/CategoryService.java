package com.rest.api.service;


import com.rest.api.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryByName(String name);

}
