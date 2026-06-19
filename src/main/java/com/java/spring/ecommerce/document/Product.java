package com.java.spring.ecommerce.document;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "Products")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private long price;
    private int stock;
    private String category;
}
