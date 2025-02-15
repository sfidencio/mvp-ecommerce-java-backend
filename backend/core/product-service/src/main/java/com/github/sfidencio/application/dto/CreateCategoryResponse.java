package com.github.sfidencio.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.hateoas.RepresentationModel;

@AllArgsConstructor
@Builder
public class CreateCategoryResponse extends RepresentationModel<CreateCategoryResponse> {
    private String name;
    private String description;
}
