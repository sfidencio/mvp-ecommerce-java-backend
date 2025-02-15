package com.github.sfidencio.adapter.input;

import com.github.sfidencio.application.dto.CreateCategoryRequest;
import com.github.sfidencio.application.dto.CreateCategoryResponse;
import com.github.sfidencio.application.mappers.ICategoryApplicationMapper;
import com.github.sfidencio.ports.input.ICreateCreateCategoryUseCaseInput;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CategoryResource implements ICategoryResource {

    private final ICreateCreateCategoryUseCaseInput createCategoryUseCase;
    private final ICategoryApplicationMapper mapper;


    @Override
    public CreateCategoryResponse createCategory(CreateCategoryRequest request) {
        var categoryDomain = this.createCategoryUseCase.execute(this.mapper.toDomain(request));
        return this.mapper.toResponse(categoryDomain);
    }
}
