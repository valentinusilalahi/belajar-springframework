package com.silalahi.valentinus.belajar.web;

import com.silalahi.valentinus.belajar.domain.Product;
import com.silalahi.valentinus.belajar.service.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @Autowired private ProductRepository productRepository;
    
    @RequestMapping("/halo")
    public String halo(){
        return "Halo Spring Boot";
    }
    
    @RequestMapping("/product/list")
    public Iterable<Product> allProducts(){
        return productRepository.findAll();
    }
}
