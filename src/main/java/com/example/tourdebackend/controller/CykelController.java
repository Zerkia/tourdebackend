package com.example.tourdebackend.controller;

import com.example.tourdebackend.domain.model.Cykelhold;
import com.example.tourdebackend.domain.model.Cykelrytter;
import com.example.tourdebackend.domain.service.CykelholdService;
import com.example.tourdebackend.domain.service.CykelrytterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tourdefrance")
@CrossOrigin
public class CykelController {

    private final CykelrytterService cykelrytterService;
    private final CykelholdService cykelholdService;

    @Autowired
    public CykelController(CykelrytterService cykelrytterService, CykelholdService cykelholdService) {
        this.cykelrytterService = cykelrytterService;
        this.cykelholdService = cykelholdService;
    }

    //CYKELHOLD

    @GetMapping("/hold")
    public ResponseEntity<List<Cykelhold>> fetchCykelhold() {
        List<Cykelhold> cykelholdList = cykelholdService.readHold();
        return new ResponseEntity<>(cykelholdList, HttpStatus.OK);
    }

    //CYKELRYTTER

    @PostMapping()
    public ResponseEntity<Cykelrytter> createCykelrytter(@RequestBody Cykelrytter cykelrytter) {
        cykelrytterService.create(cykelrytter);
        System.out.println(cykelrytter);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Cykelrytter>> fetchCykelryttere() {
        List<Cykelrytter> cykelrytterList = cykelrytterService.read();
        return new ResponseEntity<>(cykelrytterList, HttpStatus.OK);
    }

    @GetMapping("/holdid/{holdid}")
    public ResponseEntity<List<Cykelrytter>> readByHoldid(@PathVariable int holdid){
        List<Cykelrytter> readHoldId = cykelrytterService.readByHoldid(holdid);
        return new ResponseEntity<>(readHoldId, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cykelrytter> updateCykelrytter(@PathVariable int id, @RequestBody Cykelrytter cykelrytter){
        cykelrytter.setId(id);
        return new ResponseEntity<>(cykelrytterService.update(cykelrytter), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cykelrytter> deleteCykelrytter(@PathVariable int id){
        cykelrytterService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
