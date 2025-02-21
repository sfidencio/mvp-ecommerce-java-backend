package com.github.sfidencio.application.mappers;

import com.github.sfidencio.application.dto.CreateCategoryRequest;
import com.github.sfidencio.application.dto.CreateCategoryResponse;
import com.github.sfidencio.config.Constants;
import com.github.sfidencio.domain.entities.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = Constants.SPRING)
public interface ICategoryApplicationMapper {

    Category toDomain(CreateCategoryRequest createCategoryRequest);

    CreateCategoryResponse toResponse(Category category);
}
