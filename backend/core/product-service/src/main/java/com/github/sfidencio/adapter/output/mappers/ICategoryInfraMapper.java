package com.github.sfidencio.adapter.output.mappers;

import com.github.sfidencio.adapter.output.database.entities.CategoryEntity;
import com.github.sfidencio.domain.entities.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICategoryInfraMapper {
    CategoryEntity toEntity(Category category);

    Category toDomain(CategoryEntity categoryEntity);
}
