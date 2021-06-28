package com.loyalty.loyaltyapplication.repository;

import com.loyalty.loyaltyapplication.entity.MemberCompanyMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MembershipCompanyMasterRepository extends JpaRepository<MemberCompanyMaster, Integer> {
    Optional<MemberCompanyMaster> findById(Integer id);
}
