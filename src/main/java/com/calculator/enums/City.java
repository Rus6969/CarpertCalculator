package com.calculator.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum City {

    DALLAS("Dallas"),AUSTIN("Austin"),SAN_ANTONIO("San Antonio"),ARLINGTON("Arlington"),
    FAIRFAX("Fairfax"),MCLEAN("McLean");
    private final String value;

}