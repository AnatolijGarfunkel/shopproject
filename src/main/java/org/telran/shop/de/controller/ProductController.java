package org.telran.shop.de.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.shop.de.enums.ProductType;
import org.telran.shop.de.model.Product;
import org.telran.shop.de.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping
    public List<Product> getAll () {
        return productService.getAll();
    }

    @PostMapping
    public Product put (@RequestBody Product product) {
        return productService.put(product);
    }

    @GetMapping("/filter")
    public List<Product> getByType (@RequestParam (name = "type") ProductType type) {
        return productService.getByType(type);
    }

    @DeleteMapping("/{title}")
    public void deleteByTitle (@PathVariable String title) {
        productService.deleteByTitle(title);
    }
}










































