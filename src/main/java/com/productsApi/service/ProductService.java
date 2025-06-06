package com.productsApi.service;

import com.productsApi.model.Product;
import com.productsApi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
        product.setRegisterDate(LocalDateTime.now());
        return repository.save(product);
    }

    public Optional<Product> updateProduct(Long id, Product updatedProduct) {
        return repository.findById(id).map(existingProduct -> {
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setDescription(updatedProduct.getDescription());
            existingProduct.setPrice(updatedProduct.getPrice());
            return repository.save(existingProduct);
        });
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
