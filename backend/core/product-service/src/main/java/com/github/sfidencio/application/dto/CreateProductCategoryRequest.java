package com.github.sfidencio.application.dto;

import java.util.UUID;

public record CreateProductCategoryRequest(UUID id,
                                           String name) {
}
