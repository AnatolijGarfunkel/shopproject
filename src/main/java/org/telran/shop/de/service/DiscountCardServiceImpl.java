package org.telran.shop.de.service;

import org.telran.shop.de.model.DiscountCard;
import org.telran.shop.de.repository.DiscountCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountCardServiceImpl implements DiscountCardService {

    @Autowired
    DiscountCardRepository discountCardRepository;

    @Override
    public List<DiscountCard> getAll() {
        return discountCardRepository.getAll();
    }

    @Override
    public DiscountCard create(DiscountCard card) {
        return discountCardRepository.create(card);
    }


    @Override
    public DiscountCard getById(String id) {
        return discountCardRepository.getById(id);
    }

    @Override
    public void deleteById(String id) {
        discountCardRepository.deleteById(id);
    }

    @Override
    public void setExpired(String id) {
        discountCardRepository.setExpired (id);
    }

    @Override
    public List<DiscountCard> filter(boolean expired) {
        return discountCardRepository.filter(expired);
    }
}
