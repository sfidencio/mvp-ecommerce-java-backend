package com.github.sfidencio.adapter.output.database;

import com.github.sfidencio.adapter.output.database.repository.IProductRespository;
import com.github.sfidencio.adapter.output.mappers.IProductInfraMapper;
import com.github.sfidencio.domain.entities.Product;
import com.github.sfidencio.ports.output.ICreateProductPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductPersistence implements ICreateProductPort {

    private final IProductRespository respository;
    private final IProductInfraMapper mapper;

    @Override
    public void createProduct(Product product) {
        this.respository.save(this.mapper.toEntity(product));
    }
}
