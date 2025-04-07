package com.example.vineetuppal.w4_hw.controller;

import com.example.vineetuppal.w4_hw.clients.CurrencyConverterClient;
import com.example.vineetuppal.w4_hw.dto.CurrencyConverterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public class currencyConverterController {

    private final CurrencyConverterClient currencyConverterClient;

    @GetMapping("/convertCurrency")
    public CurrencyConverterDto convertCurrency(@RequestParam String fromCurrency, @RequestParam String toCurrency, @RequestParam BigDecimal units){
        CurrencyConverterDto dto = new CurrencyConverterDto(fromCurrency,toCurrency,units);
        return currencyConverterClient.convertCurrency(dto);
    }

}
