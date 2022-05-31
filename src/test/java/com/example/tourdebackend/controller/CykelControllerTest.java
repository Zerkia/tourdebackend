package com.example.tourdebackend.controller;

import com.example.tourdebackend.domain.model.Cykelhold;
import com.example.tourdebackend.domain.model.Cykelrytter;
import com.example.tourdebackend.repository.CykelholdRepository;
import com.example.tourdebackend.repository.CykelrytterRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CykelControllerTest {

    @Autowired
    private CykelrytterRepository cykelrytterRepository;
    @Autowired
    private CykelholdRepository cykelholdRepository;

    @Test
    void fetchCykelhold() {
        int numbers = cykelholdRepository.findAll().size();
        int expected = cykelholdRepository.findAll().size();
        assertEquals(expected, numbers);
    }

    @Test
    //Not sure why it doesn't save
    void createCykelrytter() {
        Cykelhold cykelhold = new Cykelhold();
        Cykelrytter cykelrytter = new Cykelrytter();
        cykelrytter.setName("kurt");
        cykelrytter.setBjergPoint(5);
        cykelrytter.setSpurtPoint(5);
        cykelrytter.setHoldid(2);
        cykelrytter.setBjergtid(55.23);
        cykelrytter.setSpurttid(22.56);
        cykelrytter.setAlder(23);
        cykelrytter.setCykelhold(cykelhold);
        cykelrytterRepository.save(cykelrytter);

        int count = cykelrytterRepository.findAll().size();

        cykelrytterRepository.delete(cykelrytter);

        int count2 = cykelrytterRepository.findAll().size();
        assertEquals(count-1, count2);
    }

    @Test
    void fetchCykelryttere() {
    }

    @Test
    void readByHoldid() {
    }

    @Test
    void updateCykelrytter() {
    }

    @Test
    void deleteCykelrytter() {
    }
}