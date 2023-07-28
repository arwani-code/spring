package com.restapi.demo.models.repos;

import com.restapi.demo.models.entities.Category;
import com.restapi.demo.models.entities.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    interface SupplierRepository extends CrudRepository<Supplier, Long> {
    }
}
