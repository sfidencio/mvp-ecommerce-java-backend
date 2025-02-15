package com.github.sfidencio.adapter.output.database;

import com.github.sfidencio.adapter.output.database.repository.ICategoryRespository;
import com.github.sfidencio.adapter.output.mappers.ICategoryInfraMapper;
import com.github.sfidencio.domain.entities.Category;
import com.github.sfidencio.ports.output.ICreateCategoryAdapterOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryPersistence implements ICreateCategoryAdapterOutput {

    private final ICategoryRespository respository;
    private final ICategoryInfraMapper mapper;

    @Override
    public Category execute(Category domain) {
        var categorySaved = this.respository.save(this.mapper.toEntity(domain));
        return this.mapper.toDomain(categorySaved);
    }
}
