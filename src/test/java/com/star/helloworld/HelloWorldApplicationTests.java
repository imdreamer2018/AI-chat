package com.star.helloworld;

import com.star.helloworld.entity.Calculator;
import com.star.helloworld.entity.Dollar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10,five.amount);
        five.times(3);
        assertEquals(15,five.amount);
    }



    @Test
    public void addTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(30,calculator.add("10,20,10,-10"));
        assertEquals(10,calculator.add("-10,-20,10,30"));
        assertEquals(0,calculator.add(""));
    }


}
