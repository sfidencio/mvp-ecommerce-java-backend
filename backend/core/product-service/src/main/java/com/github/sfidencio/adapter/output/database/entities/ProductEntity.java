package com.github.sfidencio.adapter.output.database.entities;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "products")
public class ProductEntity {
    @MongoId
    private String id;
    private String description;
    private double price;
    private double stock;
}
