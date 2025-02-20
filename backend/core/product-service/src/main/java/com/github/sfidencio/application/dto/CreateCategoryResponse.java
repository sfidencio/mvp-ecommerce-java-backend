package com.github.sfidencio.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;

@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(callSuper = false)
public class CreateCategoryResponse extends RepresentationModel<CreateCategoryResponse> {
    private String name;
    private String description;
}
