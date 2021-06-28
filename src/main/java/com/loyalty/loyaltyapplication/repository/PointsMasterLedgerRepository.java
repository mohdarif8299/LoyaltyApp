package com.loyalty.loyaltyapplication.repository;

import com.loyalty.loyaltyapplication.dto.PointsMasterLedgerDto;
import com.loyalty.loyaltyapplication.entity.PointsMasterLedger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PointsMasterLedgerRepository extends JpaRepository<PointsMasterLedger, Integer> {
    PointsMasterLedger save(PointsMasterLedgerDto pointsMasterLedgerDto);

    Optional<PointsMasterLedger> findByPointsMasterId(Integer id);

    Optional<PointsMasterLedger> findById(Integer id);

    List<PointsMasterLedger> findByApproved(String status);
}
