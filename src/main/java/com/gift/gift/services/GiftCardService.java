package com.gift.gift.services;

import com.gift.gift.entities.GiftCard;
import com.gift.gift.repositories.GiftCardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GiftCardService {

    private final GiftCardRepository giftCardRepository;

    public GiftCardService(GiftCardRepository giftCardRepository) {
        this.giftCardRepository = giftCardRepository;
    }

    public List<GiftCard> getAllGiftCards() {
        return giftCardRepository.findAll();
    }

    public Optional<GiftCard> getGiftCardById(UUID id) {
        return giftCardRepository.findById(id);
    }

    public GiftCard createGiftCard(GiftCard giftCard) {
        return giftCardRepository.save(giftCard);
    }

    public GiftCard updateGiftCard(UUID id, GiftCard updatedGiftCard) {
        return giftCardRepository.findById(id)
                .map(existing -> {
                    existing.setName(updatedGiftCard.getName());
                    existing.setEmail(updatedGiftCard.getEmail());
                    existing.setBalance(updatedGiftCard.getBalance());
                    existing.setCode(updatedGiftCard.getCode());
                    existing.setProvider(updatedGiftCard.getProvider());
                    return giftCardRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("GiftCard not found with id " + id));
    }

    public void deleteGiftCard(UUID id) {
        giftCardRepository.deleteById(id);
    }
}
