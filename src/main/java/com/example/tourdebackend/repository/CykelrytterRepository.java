package com.example.tourdebackend.repository;

import com.example.tourdebackend.domain.model.Cykelrytter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CykelrytterRepository extends JpaRepository<Cykelrytter, Integer>{

    List<Cykelrytter> findByHoldid(int holdid);
}
