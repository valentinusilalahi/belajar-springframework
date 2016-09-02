package com.silalahi.valentinus.belajar.service;

import com.silalahi.valentinus.belajar.domain.Product;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
