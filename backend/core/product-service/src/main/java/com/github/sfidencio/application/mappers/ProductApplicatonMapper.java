package com.github.sfidencio.application.mappers;

import com.github.sfidencio.application.dto.CreateProductRequest;
import com.github.sfidencio.domain.entities.Product;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductApplicatonMapper implements IProductApplicationMapper {
    @Override
    public Product toDomain(CreateProductRequest createProductRequest) {
        return new ModelMapper().map(createProductRequest, Product.class);
    }
}
