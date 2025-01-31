package fr.univ.rouen.gil.archdist.products.service;


import fr.univ.rouen.gil.archdist.products.entity.Product;
import fr.univ.rouen.gil.archdist.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
