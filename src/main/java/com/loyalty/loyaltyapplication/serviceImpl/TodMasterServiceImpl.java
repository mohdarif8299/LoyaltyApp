package com.loyalty.loyaltyapplication.serviceImpl;

import com.loyalty.loyaltyapplication.dto.TodMasterDto;
import com.loyalty.loyaltyapplication.entity.TodMaster;
import com.loyalty.loyaltyapplication.repository.TodMasterRepository;
import com.loyalty.loyaltyapplication.util.ResponseObject;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodMasterServiceImpl {
    @Autowired
    private TodMasterRepository todMasterRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<?> pullTODPoints(String membershipNumber) {
        List<TodMaster> todMasterList = todMasterRepository.findByMembershipNumber(membershipNumber);
        List<TodMasterDto> todMasterDtoList = new ArrayList<>();
        todMasterList.forEach((pointsMaster) -> {
            TodMasterDto todMasterDto = new TodMasterDto();
            modelMapper.map(pointsMaster, todMasterDto);
            todMasterDtoList.add(todMasterDto);
        });
        if (todMasterList.isEmpty())
            return new ResponseEntity<>(new ResponseObject("No Member Found with Given MemeberShip Number"), HttpStatus.OK);
        return new ResponseEntity<>(todMasterDtoList, HttpStatus.OK);
    }

}
