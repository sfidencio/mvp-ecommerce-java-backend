package com.github.sfidencio.application.dto.request;

import java.math.BigDecimal;

public record ProductRequest(String description, BigDecimal price) {
    public ProductRequest() {
        this("", BigDecimal.ZERO);
    }
}
