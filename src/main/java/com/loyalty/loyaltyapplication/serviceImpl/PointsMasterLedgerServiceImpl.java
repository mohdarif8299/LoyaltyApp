package com.loyalty.loyaltyapplication.serviceImpl;

import com.loyalty.loyaltyapplication.dto.PointsMasterLedgerDto;
import com.loyalty.loyaltyapplication.entity.PointsMasterLedger;
import com.loyalty.loyaltyapplication.repository.PointsMasterLedgerRepository;
import com.loyalty.loyaltyapplication.util.ResponseObject;
import com.loyalty.loyaltyapplication.util.ServiceApprooveLedgerObject;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PointsMasterLedgerServiceImpl {
    @Autowired
    private PointsMasterLedgerRepository pointsMasterLedgerRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<?> registerPoints(PointsMasterLedgerDto pointsMasterLedgerDto) {
        PointsMasterLedger pointsMasterLedger = new PointsMasterLedger();
        modelMapper.map(pointsMasterLedgerDto, pointsMasterLedger);
        Optional<PointsMasterLedger> pointsMasterLedgerOptional = pointsMasterLedgerRepository.findById(pointsMasterLedger.getId());
        if (pointsMasterLedgerOptional.isPresent()) {
            return new ResponseEntity<>(new ResponseObject("Already Exists"), HttpStatus.OK);
        } else {
            pointsMasterLedger.setApproved("No");
            pointsMasterLedger.setTransaction_type("CR");
            pointsMasterLedger.setReason_for_points_allocation("SALE");
            PointsMasterLedger pointsMasterLedger1 = pointsMasterLedgerRepository.save(pointsMasterLedger);
            return new ResponseEntity<>("Membership ID " + pointsMasterLedger1.getMembership_number(), HttpStatus.OK);
        }
    }

    public ResponseEntity<?> pushPoints(ServiceApprooveLedgerObject serviceApprooveLedgerObject) {
        System.out.println(serviceApprooveLedgerObject);
        Optional<PointsMasterLedger> pointsMasterLedgerOptional = pointsMasterLedgerRepository.findById(serviceApprooveLedgerObject.getPoints_master_id());
        if (pointsMasterLedgerOptional.isPresent()) {
            PointsMasterLedger pointsMasterLedger = pointsMasterLedgerOptional.get();
            pointsMasterLedger.setApproved("Yes");
            pointsMasterLedger.setPoint_allocated(100);
            pointsMasterLedgerRepository.save(pointsMasterLedger);
            List<PointsMasterLedger> pointsMasterLedgerList = pointsMasterLedgerRepository.findAll();
            List<PointsMasterLedgerDto> pointsMasterLedgerDtoList = new ArrayList<>();
            pointsMasterLedgerList.forEach((pointsMasterLedger1) -> {
                PointsMasterLedgerDto pointsMasterLedgerDto = new PointsMasterLedgerDto();
                modelMapper.map(pointsMasterLedger1, pointsMasterLedgerDto);
                pointsMasterLedgerDtoList.add(pointsMasterLedgerDto);
            });
            return new ResponseEntity<>(pointsMasterLedgerDtoList, HttpStatus.OK);
        }
        return new ResponseEntity<>(new ResponseObject("Object Not Found"), HttpStatus.OK);
    }


    public ResponseEntity<?> fetchAllPointLedgers(String status) {
        List<PointsMasterLedger> pointsMasterLedgerList = pointsMasterLedgerRepository.findByApproved(status);
        List<PointsMasterLedgerDto> pointsMasterLedgerDtoList = new ArrayList<>();
        pointsMasterLedgerList.forEach((pointsMasterLedger) -> {
            PointsMasterLedgerDto pointsMasterLedgerDto = new PointsMasterLedgerDto();
            modelMapper.map(pointsMasterLedger, pointsMasterLedgerDto);
            pointsMasterLedgerDtoList.add(pointsMasterLedgerDto);
        });
        if (pointsMasterLedgerDtoList.isEmpty())
            return new ResponseEntity<>(new ResponseObject("No Entries Found with Given Status"), HttpStatus.OK);
        return new ResponseEntity<>(pointsMasterLedgerDtoList, HttpStatus.OK);
    }
}
