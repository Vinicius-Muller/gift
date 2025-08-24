package com.gift.gift.controllers;

import com.gift.gift.dtos.GiftCardDTO;
import com.gift.gift.entities.GiftCard;
import com.gift.gift.mappers.GiftCardMapper;
import com.gift.gift.services.GiftCardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/gift-cards")
public class GiftCardsController {

    private final GiftCardService giftCardService;

    public GiftCardsController(GiftCardService giftCardService) {
        this.giftCardService = giftCardService;
    }

    @GetMapping
    public List<GiftCardDTO> getGiftCards() {
        return giftCardService.getAllGiftCards()
                .stream()
                .map(GiftCardMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public GiftCardDTO getGiftCardById(@PathVariable UUID id) {
        return giftCardService.getGiftCardById(id)
                .map(GiftCardMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("GiftCard not found with id " + id));
    }

    @PostMapping
    public GiftCardDTO createGiftCard(@RequestBody GiftCardDTO giftCardDTO) {
        GiftCard saved = giftCardService.createGiftCard(GiftCardMapper.toEntity(giftCardDTO));
        return GiftCardMapper.toDTO(saved);
    }

    @PatchMapping("/{id}")
    public GiftCardDTO updateGiftCard(@PathVariable UUID id, @RequestBody GiftCardDTO giftCardDTO) {
        GiftCard updated = giftCardService.updateGiftCard(id, GiftCardMapper.toEntity(giftCardDTO));
        return GiftCardMapper.toDTO(updated);
    }

    @DeleteMapping("/{id}")
    public void deleteGiftCard(@PathVariable UUID id) {
        giftCardService.deleteGiftCard(id);
    }
}
