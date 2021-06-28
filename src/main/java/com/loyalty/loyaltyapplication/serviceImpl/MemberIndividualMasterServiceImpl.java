package com.loyalty.loyaltyapplication.serviceImpl;

import com.loyalty.loyaltyapplication.entity.MemberIndividualMaster;
import com.loyalty.loyaltyapplication.entity.MembershipNumberMaster;
import com.loyalty.loyaltyapplication.repository.MembershipIndividualMasterRepository;
import com.loyalty.loyaltyapplication.repository.MembershipNumberMasterRepository;
import com.loyalty.loyaltyapplication.util.RegisterMemberIndividualMasterObject;
import com.loyalty.loyaltyapplication.util.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import static com.loyalty.loyaltyapplication.util.UniqueNumberGenerator.number;

@Service
public class MemberIndividualMasterServiceImpl {
    @Autowired
    private MembershipIndividualMasterRepository membershipIndividualMasterRepository;
    @Autowired
    private MembershipNumberMasterRepository membershipNumberMasterRepository;

    public ResponseEntity<?> registerIndividual(@RequestBody RegisterMemberIndividualMasterObject registerMemberIndividualMasterObject) {
        String memberNumber = number();
        MemberIndividualMaster memberIndividualMaster = registerMemberIndividualMasterObject.getMemberIndividualMaster();
        memberIndividualMaster.setMembershipNumber(memberNumber);
        MembershipNumberMaster membershipNumberMaster = new MembershipNumberMaster();
        membershipNumberMaster.setMembership_number(memberNumber);
        membershipNumberMaster.setMembership_type("INDIVIDUAL");
        membershipNumberMaster.setId(registerMemberIndividualMasterObject.getId());
        membershipNumberMaster.setEntity_used_for("NOTHING");
        membershipNumberMaster.setSubscribed_entity_details_id(registerMemberIndividualMasterObject.getSubscribe_entity_details_id());
        MembershipNumberMaster membershipNumberMaster1 = membershipNumberMasterRepository.save(membershipNumberMaster);
        MemberIndividualMaster memberIndividualMaster1 = membershipIndividualMasterRepository.save(memberIndividualMaster);
        return new ResponseEntity<>(new ResponseObject("Membership Number " + membershipNumberMaster1.getMembership_number()), HttpStatus.OK);
    }
}
