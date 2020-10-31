package com.calculator.services.floor;

import com.calculator.interfaces.floorType.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class LivingRoom implements Floor {
    @Value("${length}")
    private BigDecimal length;
    @Value("${width}")
    private BigDecimal width;


    @Override
    public BigDecimal getArea() {
        return width.multiply(length);
    }
}

