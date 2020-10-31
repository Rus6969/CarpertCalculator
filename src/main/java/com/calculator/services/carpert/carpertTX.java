package com.calculator.services.carpert;

import com.calculator.enums.City;
import com.calculator.interfaces.carpertPrices.Carpert;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class carpertTX implements Carpert {


    private static final Map<City, BigDecimal>priceInCity = new HashMap<>();
    static {
        priceInCity.put(City.DALLAS,new BigDecimal("5.5"));
        priceInCity.put(City.AUSTIN, new BigDecimal("1.3"));
        priceInCity.put((City.SAN_ANTONIO), new BigDecimal("4.4"));
    }




    @Override
    public BigDecimal SqureFeetgetPrice(City city) {
        BigDecimal defaultValue = BigDecimal.ZERO;
      Optional<Map.Entry<City,BigDecimal>> collect = priceInCity.entrySet().stream().filter(x-> x.getKey()==city).findFirst();

        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}
