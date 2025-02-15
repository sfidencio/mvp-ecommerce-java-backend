package com.github.sfidencio.adapter.output.database.entities;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "categories")
@Data
@Builder
public class CategoryEntity {
    @MongoId
    private String id;
    private String name;
    private String description;
}
