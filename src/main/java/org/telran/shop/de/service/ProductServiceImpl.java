package org.telran.shop.de.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.shop.de.enums.ProductType;
import org.telran.shop.de.model.Product;
import org.telran.shop.de.repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public Product put(Product product) {
        return productRepository.put(product);
    }

    @Override
    public List<Product> getByType(ProductType type) {
        return productRepository.getByType(type);
    }

    @Override
    public void deleteByTitle(String title) {
        productRepository.deleteByTitle(title);
    }
}
