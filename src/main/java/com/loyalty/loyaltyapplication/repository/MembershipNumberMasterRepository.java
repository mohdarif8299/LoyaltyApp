package com.loyalty.loyaltyapplication.repository;

import com.loyalty.loyaltyapplication.entity.MembershipNumberMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipNumberMasterRepository extends JpaRepository<MembershipNumberMaster, Integer> {
}
