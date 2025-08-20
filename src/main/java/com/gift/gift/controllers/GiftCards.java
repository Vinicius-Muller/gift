package com.gift.gift.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GiftCards {

    @GetMapping("/gift-cards")
    public String getGiftCards() {
        return "Here are the gift cards!";
    }
}
