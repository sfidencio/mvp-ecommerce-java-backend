package com.github.sfidencio.infraestructure.database.mongodb.repository;

import com.github.sfidencio.domain.model.Product;
import com.github.sfidencio.infraestructure.database.mongodb.entities.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends MongoRepository<ProductEntity, UUID> {
    void save(Product product);

    Product getByid(UUID id);
}
