package com.calculator.floor;

import com.calculator.interfaces.floorType.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bedroom  implements Floor {


    @Value("${width}")
    private double width;

    @Override
    public void getArea() { System.out.println(width*width); }


}
