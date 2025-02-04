package com.github.sfidencio.application.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record CreateProductRequest(
                                   String sku,
                                   UUID categoryId,
                                   String description,
                                   BigDecimal price,
                                   BigDecimal stock) {
}
