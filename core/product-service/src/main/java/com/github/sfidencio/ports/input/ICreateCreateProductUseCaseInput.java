package com.github.sfidencio.ports.input;

import com.github.sfidencio.domain.entities.Product;

import java.util.UUID;

public interface ICreateCreateProductUseCaseInput {
    Product execute(UUID idCategory, Product domain);
}
