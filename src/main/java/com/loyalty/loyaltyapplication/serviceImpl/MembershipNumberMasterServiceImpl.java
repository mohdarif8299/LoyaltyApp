package com.loyalty.loyaltyapplication.serviceImpl;

import com.loyalty.loyaltyapplication.repository.MembershipNumberMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembershipNumberMasterServiceImpl {
    @Autowired
    private MembershipNumberMasterRepository membershipNumberMasterRepositoryl;
}
