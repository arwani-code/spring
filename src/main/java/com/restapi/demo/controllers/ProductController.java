package com.restapi.demo.controllers;

import com.restapi.demo.models.entities.Product;
import com.restapi.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @GetMapping
    public Iterable<Product> getAllProduct(){
        return service.findAll();
    }

}
