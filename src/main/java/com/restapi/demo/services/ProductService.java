package com.restapi.demo.services;

import com.restapi.demo.models.entities.Product;
import com.restapi.demo.models.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public Product findOne(Long id) {
        return repository.findById(id).get();
    }

    public Iterable<Product> findAll(Product product) {
        return repository.findAll();
    }

    public void removeProduct(Product product) {
        repository.delete(product);
    }

    public List<Product> findByName(String name) {
        return repository.findByNameContains(name);
    }
}
