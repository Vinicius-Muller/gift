package com.gift.gift.mappers;

import com.gift.gift.dtos.GiftCardDTO;
import com.gift.gift.entities.GiftCard;

public class GiftCardMapper {

    public static GiftCardDTO toDTO(GiftCard entity) {
        return new GiftCardDTO(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getCreatedAt(),
                entity.getProvider(),
                entity.getCode(),
                entity.getBalance()
        );
    }

    public static GiftCard toEntity(GiftCardDTO dto) {
        GiftCard giftCard = new GiftCard();
        giftCard.setId(dto.getId());
        giftCard.setName(dto.getName());
        giftCard.setEmail(dto.getEmail());
        giftCard.setProvider(dto.getProvider());
        giftCard.setCode(dto.getCode());
        giftCard.setBalance(dto.getBalance());
        return giftCard;
    }
}
