package com.gift.gift.repositories;

import com.gift.gift.entities.GiftCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GiftCardRepository extends JpaRepository<GiftCard, UUID> {
}
