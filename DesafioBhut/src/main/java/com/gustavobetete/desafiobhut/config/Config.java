package com.gustavobetete.desafiobhut.config;

import com.gustavobetete.desafiobhut.controllers.CarController;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
