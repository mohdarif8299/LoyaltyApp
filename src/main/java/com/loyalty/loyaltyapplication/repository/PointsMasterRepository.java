package com.loyalty.loyaltyapplication.repository;

import com.loyalty.loyaltyapplication.dto.PointsMasterDto;
import com.loyalty.loyaltyapplication.entity.PointsMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PointsMasterRepository extends JpaRepository<PointsMaster, Integer> {
    PointsMaster save(PointsMasterDto pointsMasterDto);

    Optional<PointsMaster> findById(Integer id);

    List<PointsMaster> findByMembershipNumber(String membershipNumber);
}
