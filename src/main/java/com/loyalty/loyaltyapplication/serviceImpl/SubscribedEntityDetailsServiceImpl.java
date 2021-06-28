package com.loyalty.loyaltyapplication.serviceImpl;

import com.loyalty.loyaltyapplication.dto.SubscribedEntityDetailsDto;
import com.loyalty.loyaltyapplication.entity.SubscribedEntityDetails;
import com.loyalty.loyaltyapplication.repository.SubscribedEntityDetailsRepository;
import com.loyalty.loyaltyapplication.util.ResponseObject;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class SubscribedEntityDetailsServiceImpl {
    @Autowired
    private SubscribedEntityDetailsRepository subscribedEntityDetailsRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<?> subscribe(@RequestBody SubscribedEntityDetailsDto subscribedEntityDetailsDto) {
        SubscribedEntityDetails subscribedEntityDetails = new SubscribedEntityDetails();
        modelMapper.map(subscribedEntityDetailsDto, subscribedEntityDetails);
        Optional<SubscribedEntityDetails> subscribedEntityDetailsOption = subscribedEntityDetailsRepository.findById(subscribedEntityDetails.getId());
        if (subscribedEntityDetailsOption.isPresent()) {
            return new ResponseEntity<>(new ResponseObject("Already Exists"), HttpStatus.OK);
        } else {
            SubscribedEntityDetails subscribedEntityDetails1 = subscribedEntityDetailsRepository.save(subscribedEntityDetails);
            return new ResponseEntity<>("Subscribed Entity With ID " + subscribedEntityDetails1.getId(), HttpStatus.OK);
        }
    }
}
