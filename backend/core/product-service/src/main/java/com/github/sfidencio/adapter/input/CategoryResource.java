package com.github.sfidencio.adapter.input;

import com.github.sfidencio.application.dto.CreateCategoryRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CategoryResource implements ICategoryResource {


    @Override
    public void createCategory(CreateCategoryRequest request) {

    }
}
