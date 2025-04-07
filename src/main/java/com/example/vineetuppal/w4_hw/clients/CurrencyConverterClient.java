package com.example.vineetuppal.w4_hw.clients;

import com.example.vineetuppal.w4_hw.dto.CurrencyConverterDto;

import java.math.BigDecimal;

public interface CurrencyConverterClient {
    CurrencyConverterDto convertCurrency(CurrencyConverterDto currencyConverterDto);
}
