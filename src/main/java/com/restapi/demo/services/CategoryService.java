package com.restapi.demo.services;

import com.restapi.demo.models.entities.Category;
import com.restapi.demo.models.repos.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.TransactionScoped;
import java.util.Optional;

@Service
@TransactionScoped
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public Category findOne(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.orElse(null);
    }

    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    public void removeOne(Long id) {
        categoryRepository.deleteById(id);
    }
}
