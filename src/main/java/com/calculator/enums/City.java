package com.calculator.enums;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public enum City {

    DALLAS,AUSTIN,SAN_ANTONIO("San Antonio"),ARLINGTON,
    FAIRFAX,MCLEAN;


    City(Object s) {
    }
}