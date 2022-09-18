package com.example.bookstore_book.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QuantityDTO {
    String token;
    int quantity;
}
