package com.loyalty.loyaltyapplication.repository;

import com.loyalty.loyaltyapplication.dto.TodMasterLedgerDto;
import com.loyalty.loyaltyapplication.entity.TodMasterLedger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodMasterLedgerRepository extends JpaRepository<TodMasterLedger, Integer> {
    TodMasterLedger save(TodMasterLedgerDto todMasterLedgerDto);

    Optional<TodMasterLedger> findById(Integer id);
    Optional<TodMasterLedger> findByTodMasterId(Integer id);

    List<TodMasterLedger> findByApproved(String status);
}
