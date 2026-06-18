package com.java.spring.ecommerce.document;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "Customers")
public class Customer {
    @id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;
}
