package com.github.sfidencio.application.usecases;

import com.github.sfidencio.domain.entities.Product;
import com.github.sfidencio.ports.input.ICreateCommonUseCase;
import com.github.sfidencio.ports.output.ICreateProductPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateCommonUseCase implements ICreateCommonUseCase<UUID, Product> {

    private final ICreateProductPort port;

    @Override
    public void execute(UUID id, Product product) {
        product.validateStock();
        product.validatePrice();
        this.port.createProduct(product);
    }
}
