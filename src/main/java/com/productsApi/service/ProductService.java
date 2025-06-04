package com.productsApi.service;

import com.productsApi.model.Product;
import com.productsApi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> listProducts() {
        return repository.findAll();
    }

    public Optional<Product> findProductById(Long id) {
        return repository.findById(id);
    }

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        product.setId(id);
        return repository.save(product);
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
