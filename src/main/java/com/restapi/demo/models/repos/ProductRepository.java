package com.restapi.demo.models.repos;

import com.restapi.demo.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {}
