package fr.univ.rouen.gil.archdist.products.repository;

import fr.univ.rouen.gil.archdist.products.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findBySupplierId(Long supplierId);
}
