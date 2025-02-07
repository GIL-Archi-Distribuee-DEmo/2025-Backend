package fr.univ.rouen.gil.archidistrib.suppliers.repository;

import fr.univ.rouen.gil.archidistrib.suppliers.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier ,Long> {
}