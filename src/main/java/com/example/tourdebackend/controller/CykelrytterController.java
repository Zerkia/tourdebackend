package com.example.tourdebackend.controller;

import com.example.tourdebackend.domain.service.CykelholdService;
import com.example.tourdebackend.domain.service.CykelrytterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tourdefrance")
public class CykelrytterController {

    private final CykelrytterService cykelrytterService;
    private final CykelholdService cykelholdService;

    public CykelrytterController(CykelrytterService cykelrytterService, CykelholdService cykelholdService) {
        this.cykelrytterService = cykelrytterService;
        this.cykelholdService = cykelholdService;
    }
}
