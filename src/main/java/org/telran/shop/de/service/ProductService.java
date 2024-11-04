package org.telran.shop.de.service;

import org.telran.shop.de.enums.ProductType;
import org.telran.shop.de.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll ();

    Product put(Product product);

    List<Product> getByType(ProductType type);

    void deleteByTitle(String title);
}
