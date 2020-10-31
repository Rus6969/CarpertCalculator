package com.calculator;


import com.calculator.CalculatetorOperator.CalculatorOperator;
import com.calculator.enums.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext container = SpringApplication.run(CalculatorApplication.class, args);

        CalculatorOperator calculatorOperator = container.getBean("calculatorOperator",CalculatorOperator.class);

        System.out.println(calculatorOperator.getTotalCost(City.DALLAS));


    }


}
