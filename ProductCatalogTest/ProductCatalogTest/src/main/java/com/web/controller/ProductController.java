package com.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.web.model.Product;
import com.web.service.ProductService;

@RestController

public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/get/{id}")
    public List<Product> getAll() {
        return service.getAll();
    }

    @PostMapping("/api/products")

    public Product add(@RequestBody Product product) {
        return service.save(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
