package org.telran.shop.de.repository;

import org.springframework.stereotype.Component;
import org.telran.shop.de.enums.ProductType;
import org.telran.shop.de.model.Product;

import java.util.*;
import java.util.function.Predicate;

@Component
public class ProductInMemoryRepository implements ProductRepository {

    private Map<String, Product> storage = new HashMap<>();

    public ProductInMemoryRepository() {
        init ();
    }

    private void init() {
        List<Product> list = List.of(
                new Product("Apple", ProductType.FRUIT),
                new Product("Cucumber", ProductType.VEGETABLE),
                new Product("Tomato", ProductType.VEGETABLE),
                new Product("Potato", ProductType.VEGETABLE),
                new Product("Orange", ProductType.FRUIT),
                new Product("Banana", ProductType.FRUIT)
        );
        for (Product data : list) {
            storage.put(data.getTitle(), data);
        }
    }

    @Override
    public List<Product> getAll() {
        return storage.values().stream().toList();
    }

    @Override
    public Product put(Product product) {
        storage.put(product.getTitle(), product);
        return product;
    }

    @Override
    public List<Product> getByType(ProductType type) {
        return storage
                .values()
                .stream()
                .filter(product -> product.getType() == type)
                .toList();
    }

    @Override
    public void deleteByTitle(String title) {
        storage.remove(title);
    }
}








































