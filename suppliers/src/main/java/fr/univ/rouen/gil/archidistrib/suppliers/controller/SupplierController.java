package fr.univ.rouen.gil.archidistrib.suppliers.controller;


import fr.univ.rouen.gil.archidistrib.suppliers.entity.Supplier;
import fr.univ.rouen.gil.archidistrib.suppliers.service.SupplierService;
import io.micrometer.core.instrument.config.validate.Validated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/supplier")
public class SupplierController {
    @Autowired
   private  SupplierService supplierService;

    @PostMapping
    public ResponseEntity<Object> createSupplier(@RequestBody Supplier supplier , BindingResult result) {
        if(result.hasErrors()){
            return new ResponseEntity<>(result.getAllErrors() , HttpStatus.BAD_REQUEST) ;
        }
        Supplier savedSupplier = supplierService.createSupplier(supplier);
        return new ResponseEntity<>(savedSupplier , HttpStatus.CREATED) ;

    }

    @GetMapping("/{id}")
    public Optional<Supplier> getSupplierById(@PathVariable Long id){
       return Optional.ofNullable(supplierService.getSupplierById(id)) ;
    }

    @GetMapping
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }




}
