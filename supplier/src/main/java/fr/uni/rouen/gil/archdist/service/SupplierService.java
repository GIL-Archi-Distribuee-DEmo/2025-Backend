package fr.uni.rouen.gil.archdist.service;

import fr.uni.rouen.gil.archdist.entity.Supplier;
import fr.uni.rouen.gil.archdist.repository.SupplierRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;


@ApplicationScoped
public class SupplierService {
    private SupplierRepository supplierRepository ;

    @Inject
    @Channel("fournisseurs-events")
    Emitter<Supplier> kafkaEmitter;


}
