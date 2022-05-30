package com.example.tourdebackend.repository;

import com.example.tourdebackend.domain.model.Cykelhold;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CykelholdRepository extends JpaRepository<Cykelhold, Integer> {
}
