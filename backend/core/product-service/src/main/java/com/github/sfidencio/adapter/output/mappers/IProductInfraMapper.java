package com.github.sfidencio.adapter.output.mappers;

import com.github.sfidencio.adapter.output.database.entities.ProductEntity;
import com.github.sfidencio.domain.entities.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IProductInfraMapper {
    ProductEntity toEntity(Product product);

    Product toDomain(ProductEntity productEntity);
}
