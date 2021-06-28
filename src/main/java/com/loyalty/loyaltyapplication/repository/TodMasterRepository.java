package com.loyalty.loyaltyapplication.repository;

import com.loyalty.loyaltyapplication.entity.TodMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodMasterRepository extends JpaRepository<TodMaster, Integer> {
    TodMaster save(TodMaster todMaster);

    Optional<TodMaster> findById(Integer id);

    List<TodMaster> findByMembershipNumber(String membershipNumber);
}
