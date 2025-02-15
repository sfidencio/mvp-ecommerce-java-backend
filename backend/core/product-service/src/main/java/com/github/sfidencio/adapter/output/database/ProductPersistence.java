package com.github.sfidencio.adapter.output.database;

import com.github.sfidencio.adapter.output.database.repository.IProductRespository;
import com.github.sfidencio.adapter.output.mappers.IProductInfraMapper;
import com.github.sfidencio.domain.entities.Product;
import com.github.sfidencio.ports.output.ICreateProductAdapterOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductPersistence implements ICreateProductAdapterOutput {

    private final IProductRespository respository;
    private final IProductInfraMapper mapper;

    @Override
    public Product execute(Product domain) {
        var productSaved = this.respository.save(this.mapper.toEntity(domain));
        return this.mapper.toDomain(productSaved);
    }
}
