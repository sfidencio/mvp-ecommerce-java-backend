package com.github.sfidencio.adapter.output.mappers;

import com.github.sfidencio.adapter.output.database.entities.ProductEntity;
import com.github.sfidencio.domain.entities.Product;


public interface IProductInfraMapper {
    ProductEntity toEntity(Product product);
}
