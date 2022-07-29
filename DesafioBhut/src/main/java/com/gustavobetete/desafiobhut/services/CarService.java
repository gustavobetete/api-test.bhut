package com.gustavobetete.desafiobhut.services;

import com.gustavobetete.desafiobhut.controllers.feign.CarsClient;
import com.gustavobetete.desafiobhut.document.Log;
import com.gustavobetete.desafiobhut.dto.CarDataDTO;
import com.gustavobetete.desafiobhut.dto.CarDataFormDTO;
import com.gustavobetete.desafiobhut.dto.LogDTO;
import com.gustavobetete.desafiobhut.repository.LogRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarsClient carsClient;
    private final LogRepository logRepository;
    private final ModelMapper modelMapper;

    public List<CarDataDTO> getCars(){
        return carsClient.getCars().getBody();
    }

    public CarDataDTO saveCar(CarDataFormDTO carDataFormDTO){

        CarDataDTO carData = carsClient.createCars(carDataFormDTO).getBody();

        LogDTO logDTO = new LogDTO(null, carData.get_id(), LocalDateTime.now());
        Log log = modelMapper.map(logDTO, Log.class);
        logRepository.save(log);

        return carData;
    }
}
