package com.microservis.microservis_springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product addProduct(Product product) {
        return (Product) productRepository.save(product);
    } //jpa repo implements the save method by itself therefore we have to cast it as product again
    
    public void addProducts(List<Product> products) {
        productRepository.saveAll(products);
    }
    
}
