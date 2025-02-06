package fr.uni.rouen.gil.archdist.repository;

import fr.uni.rouen.gil.archdist.entity.Supplier;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public interface SupplierRepository extends PanacheRepository<Supplier> {
}
