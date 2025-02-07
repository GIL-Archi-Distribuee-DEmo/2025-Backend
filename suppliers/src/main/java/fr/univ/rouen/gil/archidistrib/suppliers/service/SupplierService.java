package fr.univ.rouen.gil.archidistrib.suppliers.service;


import fr.univ.rouen.gil.archidistrib.suppliers.entity.Supplier;
import fr.univ.rouen.gil.archidistrib.suppliers.repository.SupplierRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository ;
    private final KafkaTemplate<String, Supplier> kafkaTemplate;

    public SupplierService(KafkaTemplate<String, Supplier> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public Supplier createSupplier(Supplier supplier) {
        Supplier savedSupplier = supplierRepository.save(supplier);
        kafkaTemplate.send("fournisseurs-events", savedSupplier);
        return savedSupplier;
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    public Supplier getSupplierById(Long id) {
        return supplierRepository.findById(id).orElse(null);
    }

    public void deleteSupplier(Long id) {

    }

    public void deleteSupplier(Supplier supplier){

        Optional<Supplier> optionalSupplier = supplierRepository.findById(supplier.getId());
        if ( optionalSupplier.isPresent()){
            Supplier supplierFound = optionalSupplier.get();
            supplierRepository.delete(supplierFound);
        }else {
            throw new EntityNotFoundException("Supplier with id " + supplier.getId() + " not found");
        }

    }
}
