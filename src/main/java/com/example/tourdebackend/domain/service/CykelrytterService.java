package com.example.tourdebackend.domain.service;

import com.example.tourdebackend.domain.model.Cykelrytter;
import com.example.tourdebackend.repository.CykelrytterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CykelrytterService {

    private final CykelrytterRepository cykelrytterRepository;

    @Autowired
    public CykelrytterService(CykelrytterRepository cykelrytterRepository){
      this.cykelrytterRepository = cykelrytterRepository;
    }

    public void create (Cykelrytter cykelrytter) {
      cykelrytterRepository.save(cykelrytter);
    }

    public List<Cykelrytter> read() {
      return cykelrytterRepository.findAll();
    }

    public Optional<Cykelrytter> readById(int id) { return cykelrytterRepository.findById(id); }

    public List<Cykelrytter> readByHoldid(int holdid) { return cykelrytterRepository.findByHoldid(holdid);}

    public Cykelrytter update(Cykelrytter cykelrytter){
      return cykelrytterRepository.save(cykelrytter);
    }

    public void delete(int id) { cykelrytterRepository.deleteById(id); }
}
