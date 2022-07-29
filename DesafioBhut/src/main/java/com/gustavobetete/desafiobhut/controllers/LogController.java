package com.gustavobetete.desafiobhut.controllers;

import com.gustavobetete.desafiobhut.dto.LogDTO;
import com.gustavobetete.desafiobhut.services.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/logs")
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;

    @GetMapping
    public ResponseEntity<List<LogDTO>> getLogs(){
        return ResponseEntity.ok(logService.getLogs());
    }
}
