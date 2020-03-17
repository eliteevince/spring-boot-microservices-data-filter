package com.eliteevince.datafilterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DataFilterServiceApplication {

    @Bean
    public RestTemplate rt() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(DataFilterServiceApplication.class, args);
    }
}
