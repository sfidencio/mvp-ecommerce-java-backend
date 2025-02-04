package com.github.sfidencio.application.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record CreateCategoryRequest(
                                   String sku,
                                   UUID categoryId,
                                   String description,
                                   BigDecimal price,
                                   BigDecimal stock) {
}
