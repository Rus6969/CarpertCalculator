package com.calculator.floor;

import com.calculator.interfaces.floorType.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kitchen implements Floor {
    @Value("${radius}")
    private double radius;
    @Value("p")
    private double pNumber;


    @Override
    public void getArea() {
        System.out.println(radius * radius * pNumber);
    }
}
