package org.telran.shop.de.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telran.shop.de.entity.DiscountCard;

import java.util.List;

@Repository
public interface DiscountCardRepository extends JpaRepository<DiscountCard, Long> {

}
