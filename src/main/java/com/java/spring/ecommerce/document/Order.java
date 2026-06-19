package com.java.spring.ecommerce.document;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private Date orderDate;
    private long totalAmount;
    private String status;
    private Customer customer;
    private List<OrderItem> items;
}
