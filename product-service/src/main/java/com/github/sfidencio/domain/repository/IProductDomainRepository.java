package com.github.sfidencio.domain.repository;

import com.github.sfidencio.domain.model.Product;

import java.util.UUID;

public interface ProductDomainRepository {
    void save(Product product);
    Product getByid(UUID id);
}
