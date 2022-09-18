package com.example.bookstore_book;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BookStoreBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreBookApplication.class, args);
        System.out.println("--------------------------------");
        log.info("\nHello! Welcome to Book Store Project!");
    }

}
