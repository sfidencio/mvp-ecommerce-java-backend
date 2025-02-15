package com.github.sfidencio.application.usecases;

import com.github.sfidencio.domain.entities.Category;
import com.github.sfidencio.ports.input.ICreateCreateCategoryUseCaseInput;
import com.github.sfidencio.ports.output.ICreateCategoryAdapterOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCreateCategoryUseCase implements ICreateCreateCategoryUseCaseInput {

    private final ICreateCategoryAdapterOutput output;

    @Override
    public Category execute(Category domain) {
        return this.output.execute(domain);
    }
}
