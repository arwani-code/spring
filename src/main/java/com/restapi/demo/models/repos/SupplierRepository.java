package com.restapi.demo.models.repos;

import com.restapi.demo.models.entities.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends CrudRepository<Supplier, Long> {
}