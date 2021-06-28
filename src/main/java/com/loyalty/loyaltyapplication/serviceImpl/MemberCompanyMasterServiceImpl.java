package com.loyalty.loyaltyapplication.serviceImpl;

import com.loyalty.loyaltyapplication.entity.MemberCompanyMaster;
import com.loyalty.loyaltyapplication.entity.MembershipNumberMaster;
import com.loyalty.loyaltyapplication.repository.MembershipCompanyMasterRepository;
import com.loyalty.loyaltyapplication.repository.MembershipNumberMasterRepository;
import com.loyalty.loyaltyapplication.util.RegisterMemberCompanyMasterObject;
import com.loyalty.loyaltyapplication.util.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import static com.loyalty.loyaltyapplication.util.UniqueNumberGenerator.number;


@Service
public class MemberCompanyMasterServiceImpl {
    @Autowired
    private MembershipCompanyMasterRepository membershipCompanyMasterRepository;
    @Autowired
    private MembershipNumberMasterRepository membershipNumberMasterRepository;

    public ResponseEntity<?> registerCompany(@RequestBody RegisterMemberCompanyMasterObject registerMemberCompanyMasterObject) {
        String memberNumber = number();
        MemberCompanyMaster memberCompanyMaster = registerMemberCompanyMasterObject.getMemberCompanyMaster();
        memberCompanyMaster.setMembership_number(memberNumber);
        MembershipNumberMaster membershipNumberMaster = new MembershipNumberMaster();
        membershipNumberMaster.setMembership_number(memberNumber);
        membershipNumberMaster.setMembership_type("COMPANY");
        membershipNumberMaster.setId(registerMemberCompanyMasterObject.getId());
        membershipNumberMaster.setEntity_used_for("NOTHING");
        membershipNumberMaster.setSubscribed_entity_details_id(registerMemberCompanyMasterObject.getSubscribe_entity_details_id());
        MembershipNumberMaster membershipNumberMaster1 = membershipNumberMasterRepository.save(membershipNumberMaster);
        MemberCompanyMaster memberCompanyMaster1 = membershipCompanyMasterRepository.save(memberCompanyMaster);
        //System.out.println(registerMemberIndividualMasterObject.getMemberIndividualMaster());
        return new ResponseEntity<>(new ResponseObject("Membership no " + membershipNumberMaster1.getMembership_number()), HttpStatus.OK);
    }
}
