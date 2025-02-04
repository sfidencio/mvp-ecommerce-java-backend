package com.github.sfidencio.application.mappers;

import com.github.sfidencio.application.dto.CreateProductRequest;
import com.github.sfidencio.domain.entities.Product;
import org.modelmapper.ModelMapper;


public interface ProductApplicationMapper {
    default Product toDomain(CreateProductRequest createProductRequest) {
        return new ModelMapper().map(createProductRequest, Product.class);
    }
}
