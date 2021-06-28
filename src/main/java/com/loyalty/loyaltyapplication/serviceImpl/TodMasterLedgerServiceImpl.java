package com.loyalty.loyaltyapplication.serviceImpl;

import com.loyalty.loyaltyapplication.dto.TodMasterLedgerDto;
import com.loyalty.loyaltyapplication.entity.TodMasterLedger;
import com.loyalty.loyaltyapplication.repository.TodMasterLedgerRepository;
import com.loyalty.loyaltyapplication.util.ResponseObject;
import com.loyalty.loyaltyapplication.util.ServiceApprooveTodLedgerObject;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.loyalty.loyaltyapplication.util.UniqueNumberGenerator.number;

@Service
public class TodMasterLedgerServiceImpl {
    @Autowired
    private TodMasterLedgerRepository todMasterLedgerRepository;

    @Autowired
    private ModelMapper modelMapper;


    public ResponseEntity<?> pushTODPoints(TodMasterLedgerDto todMasterLedgerDto) {
        TodMasterLedger todMasterLedger = new TodMasterLedger();
        modelMapper.map(todMasterLedgerDto, todMasterLedger);
        Optional<TodMasterLedger> todMasterLedgerOptional = todMasterLedgerRepository.findById(todMasterLedgerDto.getId());
        if (todMasterLedgerOptional.isPresent()) {
            return new ResponseEntity<>(new ResponseObject("Already Exists"), HttpStatus.OK);
        } else {
            todMasterLedger.setMembershipNumber(number());
            todMasterLedger.setApproved("No");
            todMasterLedger.setTransaction_type("CR");
            TodMasterLedger todMasterLedger1 = todMasterLedgerRepository.save(todMasterLedger);
            return new ResponseEntity<>("Membership ID " + todMasterLedger1.getMembershipNumber(), HttpStatus.OK);
        }
    }

    public ResponseEntity<?> fetchAllTodLedgers(String status) {
        List<TodMasterLedger> todMasterLedgerList = todMasterLedgerRepository.findByApproved(status);
        List<TodMasterLedgerDto> todMasterLedgerDtoList = new ArrayList<>();
        todMasterLedgerList.forEach((todMasterLedger) -> {
            TodMasterLedgerDto todMasterLedgerDto = new TodMasterLedgerDto();
            modelMapper.map(todMasterLedger, todMasterLedgerDto);
            todMasterLedgerDtoList.add(todMasterLedgerDto);
        });
        if (todMasterLedgerDtoList.isEmpty())
            return new ResponseEntity<>(new ResponseObject("No Entries Found with Given Status"), HttpStatus.OK);
        return new ResponseEntity<>(todMasterLedgerDtoList, HttpStatus.OK);
    }

    public ResponseEntity<?> pushTODPoints(ServiceApprooveTodLedgerObject serviceApprooveTodLedgerObject) {
        System.out.println(serviceApprooveTodLedgerObject);
        Optional<TodMasterLedger> todMasterLedgerOptional = todMasterLedgerRepository.findById(serviceApprooveTodLedgerObject.getTod_master_id());
        if (todMasterLedgerOptional.isPresent()) {
            TodMasterLedger todMasterLedger = todMasterLedgerOptional.get();
            todMasterLedger.setApproved("Yes");
            todMasterLedger.setTod_allocated(100);
            todMasterLedgerRepository.save(todMasterLedger);
            List<TodMasterLedger> todMasterLedgerList = todMasterLedgerRepository.findAll();
            List<TodMasterLedgerDto> todMasterLedgerDtoList = new ArrayList<>();
            todMasterLedgerList.forEach((todMasterLedger1) -> {
                TodMasterLedgerDto todMasterLedgerDto = new TodMasterLedgerDto();
                modelMapper.map(todMasterLedger1, todMasterLedgerDto);
                todMasterLedgerDtoList.add(todMasterLedgerDto);
            });
            return new ResponseEntity<>(todMasterLedgerDtoList, HttpStatus.OK);
        }
        return new ResponseEntity<>(new ResponseObject("Object Not Found"), HttpStatus.OK);
    }
}
