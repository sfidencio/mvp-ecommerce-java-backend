package com.github.sfidencio.domain.service;

import com.github.sfidencio.application.dto.request.ProductResponse;
import com.github.sfidencio.application.usecase.IProductUseCase;
import com.github.sfidencio.domain.model.Product;
import com.github.sfidencio.domain.repository.IProductDomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductUseCase {

    private final IProductDomainRepository repository;

    @Override
    public void save(Product product) {
        this.repository.save(product);
    }

    @Override
    public ProductResponse getById(UUID id) {
        return null;
    }
}
