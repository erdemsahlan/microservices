package com.project.accountservice.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomBeanFactory {

    @Bean
    public ModelMapper getModdelMapper(){
        return new getModdelMapper();
    }
}
