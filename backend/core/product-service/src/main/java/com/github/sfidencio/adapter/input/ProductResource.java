package com.github.sfidencio.adapter.input;

import com.github.sfidencio.application.dto.CreateProductRequest;
import com.github.sfidencio.application.mappers.ProductApplicationMapper;
import com.github.sfidencio.ports.input.ICreateProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductApplicationResource implements ProductApplicationMapper {
    private final ICreateProductUseCase createProductUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private void createProduct(CreateProductRequest request) {
        this.createProductUseCase.execute(toDomain(request));
    }
}
