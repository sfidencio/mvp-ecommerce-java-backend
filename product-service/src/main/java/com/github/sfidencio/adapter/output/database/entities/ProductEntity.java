package com.github.sfidencio.adapter.output.database.entities;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;

@Document(collection = "products")
@Builder
@Data
public class ProductEntity {
    @MongoId
    private String id;
    private String description;
    private BigDecimal price;
    private BigDecimal stock;
}
