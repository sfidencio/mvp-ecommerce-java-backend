package com.github.sfidencio.adapter.input;

import com.github.sfidencio.application.dto.CreateProductRequest;
import com.github.sfidencio.application.mappers.IProductApplicationMapper;
import com.github.sfidencio.domain.entities.Product;
import com.github.sfidencio.ports.input.ICreateCommonUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class ProductResource implements IProductResource {
    private final ICreateCommonUseCase<UUID, Product> createProductUseCase;
    private final IProductApplicationMapper mapper;

    @Override
    public void createProduct(UUID categoryID, CreateProductRequest request) {
        this.createProductUseCase.execute(categoryID, this.mapper.toDomain(request));
    }
}
