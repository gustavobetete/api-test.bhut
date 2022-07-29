package com.gustavobetete.desafiobhut.controllers;

import com.gustavobetete.desafiobhut.dto.CarDataDTO;
import com.gustavobetete.desafiobhut.dto.CarDataFormDTO;
import com.gustavobetete.desafiobhut.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/listCars")
    public ResponseEntity<List<CarDataDTO>> listCars(){
        return ResponseEntity.ok(carService.getCars());
    }

    @PostMapping("/createCar")
    public ResponseEntity<CarDataDTO> createCar(@RequestBody CarDataFormDTO carDataForm){
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.saveCar(carDataForm));
    }
}
