package com.calculator.CalculatetorOperator;
import com.calculator.enums.City;
import com.calculator.interfaces.carpertPrices.Carpert;
import com.calculator.interfaces.floorType.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
public class CalculatorOperator {
    @Qualifier("carpertTX")
    @Autowired
    private Carpert carpert;


    @Qualifier("kitchen")
    @Autowired
    private Floor floor;



    public String getTotalCost(City city) throws Exception {
     BigDecimal totalCost = carpert.SqureFeetgetPrice(city).multiply(floor.getArea());

        if (totalCost.compareTo(BigDecimal.ZERO) == 0) {
            throw new Exception("This city does not exist");
        }

        return "Total Cost for Carpet :" + (carpert.SqureFeetgetPrice(city).multiply(floor.getArea()));
    }

    }

