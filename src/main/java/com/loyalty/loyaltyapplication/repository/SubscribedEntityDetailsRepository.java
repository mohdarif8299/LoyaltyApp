package com.loyalty.loyaltyapplication.repository;

import com.loyalty.loyaltyapplication.dto.SubscribedEntityDetailsDto;
import com.loyalty.loyaltyapplication.entity.SubscribedEntityDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubscribedEntityDetailsRepository extends JpaRepository<SubscribedEntityDetails, Integer> {
    SubscribedEntityDetails save(SubscribedEntityDetailsDto subscribedEntityDetailsDto);

    Optional<SubscribedEntityDetails> findById(Integer id);
}
