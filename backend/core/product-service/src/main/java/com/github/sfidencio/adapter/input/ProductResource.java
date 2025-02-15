package com.github.sfidencio.adapter.input;

import com.github.sfidencio.application.dto.CreateProductRequest;
import com.github.sfidencio.application.dto.CreateProductResponse;
import com.github.sfidencio.application.mappers.IProductApplicationMapper;
import com.github.sfidencio.ports.input.ICreateCreateProductUseCaseInput;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class ProductResource implements IProductResource {
    private final ICreateCreateProductUseCaseInput createProductUseCase;
    private final IProductApplicationMapper mapper;

    @Override
    public CreateProductResponse createProduct(UUID categoryID, CreateProductRequest request) {
        var productDomain = this.createProductUseCase.execute(categoryID, this.mapper.toDomain(request));
        return this.mapper.toResponse(productDomain);
    }
}
