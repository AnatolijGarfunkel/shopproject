package org.telran.shop.de.service;

import org.telran.shop.de.entity.DiscountCard;
import org.telran.shop.de.repository.DiscountCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountCardServiceImpl implements DiscountCardService {

    @Autowired
    DiscountCardRepository repository;
}
