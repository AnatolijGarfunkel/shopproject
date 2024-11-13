package org.telran.shop.de.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.telran.shop.de.enums.ProductType;
import org.telran.shop.de.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
