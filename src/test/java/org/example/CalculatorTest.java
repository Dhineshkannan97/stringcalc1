package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.testng.annotations.Test;

import static org.example.Calculator.addition;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addTest(){
        Assertions.assertEquals(3, addition("1,2"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> addition("-1,2"));
    }@Test
    public void testThreeNumbers(){
        assertEquals(6, Calculator.addition("1,2,3"));
    }

    @Test
    public void testNewLine(){
        assertEquals(6, Calculator.addition("1\n2,3"));
    }
    @Test
    public void testOverThousand(){
        assertEquals(2, Calculator.addition("1000,2"));
    }
}
//class TestRunner{
//    Result results= JUnitCore.runClasses(CalculatorTest.class);
//
//    public static void main(String[] args) {
//        Result results= JUnitCore.runClasses(CalculatorTest.class);
//        for (Failure fail: results.getFailures()
//        ) {
//            System.out.println(fail.toString());
//        }
//        System.out.println(results.wasSuccessful());
//    }}
