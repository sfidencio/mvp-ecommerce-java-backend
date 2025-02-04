package com.github.sfidencio.application.mappers;

import com.github.sfidencio.application.dto.CreateProductRequest;
import com.github.sfidencio.domain.entities.Product;


public interface IProductApplicationMapper {
    Product toDomain(CreateProductRequest createProductRequest);
}
