package com.project.ticketservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

@Configuration
public class TicketConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
