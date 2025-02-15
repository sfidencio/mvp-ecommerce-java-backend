package com.github.sfidencio.ports.output;

import com.github.sfidencio.domain.entities.Category;

public interface ICreateCategoryAdapterOutput {
  Category execute(Category domain);
}
