package com.restapi.demo.services;

import com.restapi.demo.models.entities.Supplier;
import com.restapi.demo.models.repos.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.TransactionScoped;
import java.util.Optional;

@Service
@TransactionScoped
public class SupplierService {

    @Autowired
    private CategoryRepository.SupplierRepository supplierRepository;

    public Supplier save(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public Supplier findOne(Long id) {
        Optional<Supplier> supplier = supplierRepository.findById(id);
        return supplier.orElse(null);
    }

    public Iterable<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    public void removeOne(Long id) {
        supplierRepository.deleteById(id);
    }
}
