package com.example.vineetuppal.w4_hw.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyConverterDto {
    private String fromCurrency;
    private String toCurrency;
    private BigDecimal units;
}
