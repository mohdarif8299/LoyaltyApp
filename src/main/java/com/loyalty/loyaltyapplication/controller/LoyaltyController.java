package com.loyalty.loyaltyapplication.controller;

import com.loyalty.loyaltyapplication.dto.PointsMasterLedgerDto;
import com.loyalty.loyaltyapplication.dto.SubscribedEntityDetailsDto;
import com.loyalty.loyaltyapplication.dto.TodMasterLedgerDto;
import com.loyalty.loyaltyapplication.serviceImpl.*;
import com.loyalty.loyaltyapplication.util.RegisterMemberCompanyMasterObject;
import com.loyalty.loyaltyapplication.util.RegisterMemberIndividualMasterObject;
import com.loyalty.loyaltyapplication.util.ServiceApprooveLedgerObject;
import com.loyalty.loyaltyapplication.util.ServiceApprooveTodLedgerObject;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/api/loyalty")
public class LoyaltyController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private SubscribedEntityDetailsServiceImpl subscribedEntityDetailsService;

    @Autowired
    private PointsMasterLedgerServiceImpl pointsMasterLedgerService;

    @Autowired
    private PointsMasterServiceImpl pointsMasterService;

    @Autowired
    private TodMasterServiceImpl todMasterService;

    @Autowired
    private TodMasterLedgerServiceImpl todMasterLedgerService;

    @Autowired
    private MemberIndividualMasterServiceImpl memberIndividualMasterService;

    @Autowired
    private MemberCompanyMasterServiceImpl memberCompanyMasterService;


    @PostMapping("/subscribe")
    private ResponseEntity<?> subscribe(@RequestBody SubscribedEntityDetailsDto subscribedEntityDetailsDto) {
        return subscribedEntityDetailsService.subscribe(subscribedEntityDetailsDto);
    }

    @PostMapping("/registerIndividual")
    private ResponseEntity<?> registerIndividual(@RequestBody RegisterMemberIndividualMasterObject registerMemberIndividualMasterObject) {
        return memberIndividualMasterService.registerIndividual(registerMemberIndividualMasterObject);
    }

    @PostMapping("/registerCompany")
    private ResponseEntity<?> registerCompany(@RequestBody RegisterMemberCompanyMasterObject registerMemberCompanyMasterObject) {
        return memberCompanyMasterService.registerCompany(registerMemberCompanyMasterObject);
    }

    @PostMapping("/registerPoints")
    private ResponseEntity<?> registerPoints(@RequestBody PointsMasterLedgerDto pointsMasterLedgerDto) {
        return pointsMasterLedgerService.registerPoints(pointsMasterLedgerDto);
    }

    @GetMapping("/fetchAllPointLedgers/{status}")
    private ResponseEntity<?> fetchAllPointLedgers(@PathVariable String status) {
        return pointsMasterLedgerService.fetchAllPointLedgers(status);
    }

    @GetMapping("/fetchAllTodLedgers/{status}")
    private ResponseEntity<?> fetchAllTodLedgers(@PathVariable String status) {
        return todMasterLedgerService.fetchAllTodLedgers(status);
    }

    @PutMapping("/pushpoints")
    private ResponseEntity<?> pushPoints(@RequestBody ServiceApprooveLedgerObject serviceApprooveLedgerObject) {
        return pointsMasterLedgerService.pushPoints(serviceApprooveLedgerObject);
    }

    @PutMapping("/pushTODPoints")
    private ResponseEntity<?> pushTODPoints(@RequestBody ServiceApprooveTodLedgerObject serviceApprooveTodLedgerObject) {
        return todMasterLedgerService.pushTODPoints(serviceApprooveTodLedgerObject);
    }

    @GetMapping("/pullpoints/{membershipNumber}")
    private ResponseEntity<?> pullPoints(@PathVariable String membershipNumber) {
        return pointsMasterService.pullPoints(membershipNumber);
    }

    @PostMapping("/registerTOD")
    private ResponseEntity<?> pushTODPoints(@RequestBody TodMasterLedgerDto todMasterLedgerDto) {
        return todMasterLedgerService.pushTODPoints(todMasterLedgerDto);
    }

    @GetMapping("/pullTODpoints/{membershipNumber}")
    private ResponseEntity<?> pullTODPoints(@PathVariable String membershipNumber) {
        return todMasterService.pullTODPoints(membershipNumber);
    }
}
