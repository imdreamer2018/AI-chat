package com.star.helloworld.entity;

public class Calculator {

    public int add(final String numbers){
        int resultValue =0;
        String[] numbersArray = numbers.split(",");
        for (String number: numbersArray){
            if (!number.trim().isEmpty()){
                resultValue += Integer.parseInt(number);
            }
        }
        return resultValue;
    }

}
