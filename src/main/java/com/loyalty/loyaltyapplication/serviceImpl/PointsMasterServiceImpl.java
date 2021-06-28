package com.loyalty.loyaltyapplication.serviceImpl;

import com.loyalty.loyaltyapplication.dto.PointsMasterDto;
import com.loyalty.loyaltyapplication.entity.PointsMaster;
import com.loyalty.loyaltyapplication.repository.PointsMasterRepository;
import com.loyalty.loyaltyapplication.util.ResponseObject;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PointsMasterServiceImpl {
    @Autowired
    private PointsMasterRepository pointsMasterRepository;
    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<?> pullPoints(String membershipNumber) {
        List<PointsMaster> pointsMasterList = pointsMasterRepository.findByMembershipNumber(membershipNumber);
        List<PointsMasterDto> pointsMasterDtoList = new ArrayList<>();
        pointsMasterList.forEach((pointsMaster) -> {
            PointsMasterDto pointsMasterDto = new PointsMasterDto();
            modelMapper.map(pointsMaster, pointsMasterDto);
            pointsMasterDtoList.add(pointsMasterDto);
        });
        if (pointsMasterDtoList.isEmpty())
            return new ResponseEntity<>(new ResponseObject("No Member Found with Given MemeberShip Number"), HttpStatus.OK);
        return new ResponseEntity<>(pointsMasterDtoList, HttpStatus.OK);
    }
}
