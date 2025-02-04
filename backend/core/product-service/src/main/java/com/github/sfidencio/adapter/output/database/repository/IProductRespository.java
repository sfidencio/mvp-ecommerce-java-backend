package com.github.sfidencio.adapter.output.database.repository;

import com.github.sfidencio.adapter.output.database.entities.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository  extends MongoRepository<ProductEntity, String> {
}
