package com.github.sfidencio.application.mappers;

import com.github.sfidencio.application.dto.CreateProductRequest;
import com.github.sfidencio.application.dto.CreateProductResponse;
import com.github.sfidencio.domain.entities.Product;
import org.mapstruct.Mapper;

@Mapper
public interface IProductApplicationMapper {
    Product toDomain(CreateProductRequest createProductRequest);

    CreateProductResponse toResponse(Product product);
}
