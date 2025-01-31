package fr.univ.rouen.gil.archdist.products.kafka;


import fr.univ.rouen.gil.archdist.products.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class SupplierConsumer {
    private  final ProductRepository productRepository ;

    public SupplierConsumer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


}
