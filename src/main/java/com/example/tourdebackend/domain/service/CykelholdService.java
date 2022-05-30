package com.example.tourdebackend.domain.service;

import com.example.tourdebackend.domain.model.Cykelhold;
import com.example.tourdebackend.repository.CykelholdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CykelholdService {

    private final CykelholdRepository cykelholdRepository;

    @Autowired
    public CykelholdService(CykelholdRepository cykelholdRepository){
        this.cykelholdRepository = cykelholdRepository;
    }

    public List<Cykelhold> readHold() {
      return cykelholdRepository.findAll();
    }
}
