package com.github.sfidencio.domain.entities;

import lombok.Builder;

@Builder
public record Category(String name, String description) {
}
