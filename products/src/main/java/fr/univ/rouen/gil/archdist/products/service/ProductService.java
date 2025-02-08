package fr.univ.rouen.gil.archdist.products.service;


import fr.univ.rouen.gil.archdist.products.entity.Product;
import fr.univ.rouen.gil.archdist.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
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

    @KafkaListener(topics = "fournisseurs-events", groupId = "products-group")
    public void consumeFournisseurEvent(String message) {
        System.out.println("📥 Message Kafka reçu: " + message);
        // Implémenter la logique de mise à jour si besoin (par exemple, notifier les produits liés)
    }
}
