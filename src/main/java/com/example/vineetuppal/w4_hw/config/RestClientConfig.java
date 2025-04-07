package com.example.vineetuppal.w4_hw.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Configuration
public class RestClientConfig {

    @Value("${currencyConverterService.base.url}")
    private String BASE_URL;

    @Bean
    @Qualifier("currencyConverterRestClient")
    RestClient getCurrencyConverterRestClient(){
        return RestClient.builder()
                .baseUrl(BASE_URL)
                .defaultHeader(CONTENT_TYPE,APPLICATION_JSON_VALUE)
                .build();
    }
}
