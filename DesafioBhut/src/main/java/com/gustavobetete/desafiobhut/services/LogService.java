package com.gustavobetete.desafiobhut.services;

import com.gustavobetete.desafiobhut.document.Log;
import com.gustavobetete.desafiobhut.dto.LogDTO;
import com.gustavobetete.desafiobhut.repository.LogRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LogService {

    private final LogRepository logRepository;
    private final ModelMapper modelMapper;

    public List<LogDTO> getLogs(){

        List<Log> logs = logRepository.findAll();

        return  logs.stream().map(e -> modelMapper.map(e, LogDTO.class)).toList();
    }
}
