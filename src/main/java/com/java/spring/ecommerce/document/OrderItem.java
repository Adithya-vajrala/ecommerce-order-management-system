package com.java.spring.ecommerce.document;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "orderItems")
public class OrderItem {
    @id
    private String id;
    private int quantity;
    private long price;
    private Product product;
    private Order order;
}
