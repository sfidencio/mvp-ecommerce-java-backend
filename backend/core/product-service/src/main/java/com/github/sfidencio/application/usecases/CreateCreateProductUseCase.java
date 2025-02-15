package com.github.sfidencio.application.usecases;

import com.github.sfidencio.domain.entities.Product;
import com.github.sfidencio.ports.input.ICreateCreateProductUseCaseInput;
import com.github.sfidencio.ports.output.ICreateProductAdapterOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateCreateProductUseCase implements ICreateCreateProductUseCaseInput {

    private final ICreateProductAdapterOutput output;

    @Override
    public Product execute(UUID idCategory, Product domain) {
        domain.validatePrice();
        domain.validateStock();
        return this.output.execute(domain);
    }
}
