package org.telran.shop.de.controller;

import org.telran.shop.de.model.DiscountCard;
import org.telran.shop.de.service.DiscountCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/discountcards")
public class DiscountCardController {

    @Autowired
    private DiscountCardService cardService;

    @GetMapping
    public List<DiscountCard> getAll () {
        return cardService.getAll();
    }

    @PostMapping
    public DiscountCard create (@RequestBody DiscountCard card) {
        return cardService.create(card);
    }

    @GetMapping("/{id}")
    public DiscountCard getById (@PathVariable(name = "id") String id) {
        return cardService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable(name = "id") String cardId) {
        cardService.deleteById(cardId);
    }

    @PostMapping("/expired/{id}")
    public void setExpired(@PathVariable String id) {
        cardService.setExpired(id);
    }

    @GetMapping("/filter")
    public List<DiscountCard> getAllByState (@RequestParam(name = "expired") boolean expired) {
        return cardService.filter(expired);
    }
}



















































