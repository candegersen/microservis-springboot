package com.microservis.microservis_springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservisSpringbootApplication implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(MicroservisSpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Product> products = Arrays.asList(
                new Product(1L, "Banana", 100.0),
                new Product(2L, "Apple", 200.0),
                new Product(3L, "Orange", 300.0),
                new Product(4L, "Grape", 400.0),
                new Product(5L, "Pineapple", 500.0),
                new Product(6L, "Redbull", 600.0),
                new Product(7L, "Capsule Coffee", 700.0));
        productService.addProducts(products);
    }

    //http://localhost:8080/api/products - shows the data
}
