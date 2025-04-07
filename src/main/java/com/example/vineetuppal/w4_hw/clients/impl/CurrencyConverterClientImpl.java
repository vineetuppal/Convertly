package com.example.vineetuppal.w4_hw.clients.impl;

import com.example.vineetuppal.w4_hw.clients.CurrencyConverterClient;
import com.example.vineetuppal.w4_hw.dto.CurrencyConverterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.math.BigDecimal;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CurrencyConverterClientImpl implements CurrencyConverterClient {

    private final RestClient restClient;

    @Value("${currencyConverterService.api.key}")
    private String apiKey;

    @Override
    public CurrencyConverterDto convertCurrency(CurrencyConverterDto request) {

        String url = String.format("?apikey=%s&currencies=%s&base_currency=%s",
                apiKey, request.getToCurrency(), request.getFromCurrency());

        Map<String, Object> response = restClient.get()
                .uri(url)
                .retrieve()
                .body(Map.class);

        Map<String,Double> data = (Map<String,Double>) response.get("data");
        Double rate = (Double) data.get(request.getToCurrency());
        BigDecimal convertedValue = BigDecimal.valueOf(rate).multiply(request.getUnits());

        return new CurrencyConverterDto(
                request.getFromCurrency(),
                request.getToCurrency(),
                convertedValue
        );
    }
}
