package com.github.sfidencio.adapter.input;

import com.github.sfidencio.application.dto.CreateCategoryRequest;
import com.github.sfidencio.application.dto.CreateCategoryResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/v1/categories")
@Tag(name = "Category API", description = "API for managing products")
public interface ICategoryResource {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(
            summary = "Create a new Category",
            description = "Create a new Category with the specified details",
            responses = {
                    @ApiResponse(responseCode = "201", description = "Category created successfully"),
                    @ApiResponse(responseCode = "409", description = "Category already exists"),
                    @ApiResponse(responseCode = "400", description = "Invalid request payload")
            }
    )
    CreateCategoryResponse createCategory(
            @RequestBody
            @Parameter(description = "Details of the category to create", required = true)
            CreateCategoryRequest request
    );
}
