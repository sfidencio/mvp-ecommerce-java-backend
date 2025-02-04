package com.github.sfidencio.adapter.output.mappers;

import com.github.sfidencio.adapter.output.database.entities.ProductEntity;
import com.github.sfidencio.domain.entities.Product;
import org.modelmapper.ModelMapper;

public interface ProductInfraMapper {
    default ProductEntity toEntity(Product product) {
        return new ModelMapper().map(product, ProductEntity.class);
    }
}
