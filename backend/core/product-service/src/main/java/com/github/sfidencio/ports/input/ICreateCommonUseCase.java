package com.github.sfidencio.ports.input;

public interface ICreateCommonUseCase<T, K> {
    void execute(T id, K domain);
}
