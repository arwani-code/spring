package com.restapi.demo.services;

import com.restapi.demo.models.entities.Product;
import com.restapi.demo.models.entities.Supplier;
import com.restapi.demo.models.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public Product findOne(Long id) {
        Optional<Product> product = repository.findById(id);
        if (product.isEmpty()) {
            return null;
        }
        return repository.findById(id).get();
    }

    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    public void removeProduct(Long id) {
        repository.deleteById(id);
    }

    public Product addSupplier(Supplier supplier, Long productId) {
        Product product = findOne(productId);
        if (product == null) {
            throw new RuntimeException("Product with id " + productId + "not found");
        }
        product.getSuppliers().add(supplier);
        return saveProduct(product);
    }
}

