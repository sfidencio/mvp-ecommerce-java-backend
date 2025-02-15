package com.github.sfidencio.ports.input;

import com.github.sfidencio.domain.entities.Category;

public interface ICreateCreateCategoryUseCaseInput {
    Category execute(Category domain);
}
