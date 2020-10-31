package com.calculator.services.carpert;

import com.calculator.enums.City;
import com.calculator.interfaces.carpertPrices.Carpert;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@Component
public class carpertVA implements Carpert {

    private static final Map<City, BigDecimal> priceInCity = new HashMap<>();

    static {
        priceInCity.put(City.ARLINGTON, new BigDecimal("4.3"));
        priceInCity.put(City.FAIRFAX, new BigDecimal("2.3"));
        priceInCity.put(City.MCLEAN, new BigDecimal("4.7"));
    }


    @Override
    public BigDecimal SqureFeetgetPrice(City city) {

        BigDecimal defaultValue = BigDecimal.ZERO;
        Optional<Map.Entry<City, BigDecimal>> collect = priceInCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();
        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}
