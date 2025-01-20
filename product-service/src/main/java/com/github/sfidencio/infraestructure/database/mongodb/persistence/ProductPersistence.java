package com.github.sfidencio.infraestructure.database.mongodb.persistence;

import com.github.sfidencio.domain.model.Product;
import com.github.sfidencio.domain.repository.IProductDomainRepository;
import com.github.sfidencio.infraestructure.database.mongodb.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class ProductDomainPersistence implements IProductDomainRepository {

    private final IProductRepository repository;

    @Override
    public void save(Product product) {
        this.repository.save(product);
    }

    @Override
    public Product getByid(UUID id) {
        return this.repository.getByid(id);
    }
}
