package com.gustavobetete.desafiobhut.controllers.feign;

import com.gustavobetete.desafiobhut.dto.CarDataDTO;
import com.gustavobetete.desafiobhut.dto.CarDataFormDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(url = "http://api-test.bhut.com.br:3000/api/cars", name = "cars-api")
public interface CarsClient {

    @GetMapping
    ResponseEntity<List<CarDataDTO>> getCars();

    @PostMapping
    ResponseEntity<CarDataDTO> createCars(@RequestBody CarDataFormDTO carDataForm);
}
