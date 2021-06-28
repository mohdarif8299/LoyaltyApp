package com.loyalty.loyaltyapplication.repository;

import com.loyalty.loyaltyapplication.entity.MemberIndividualMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MembershipIndividualMasterRepository extends JpaRepository<MemberIndividualMaster, Integer> {
    Optional<MemberIndividualMaster> findById(Integer id);
}
