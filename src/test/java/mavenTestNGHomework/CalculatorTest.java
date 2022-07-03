package mavenTestNGHomework;

import mavenTestNGHomework.CalculatorTest;
import org.testng.Assert;
import org.testng.annotations.*;


public class CalculatorTest {


    CalculatorForHomework calculator;

    @BeforeClass
    public void beforeCalculatorTestH() {
        System.out.println("Calculator testing");
    }

    @BeforeMethod
    public void beforeAddMethod() {
        System.out.println("Test for adding starts.");
    }

    @Test
    public void testAddMethod() {
        calculator = new CalculatorForHomework();

        Assert.assertEquals(calculator.add(5, 6), 11);
    }

    @AfterMethod
    public void afterAddMethod() {
        System.out.println("Test for adding ended.");
    }

    @BeforeMethod
    public void beforeSubstractMethod() {
        System.out.println("Test for substract starts.");
    }

    @Test
    public void testSubstractMethod() {
        calculator = new CalculatorForHomework();
        Assert.assertEquals(calculator.substract(7, 5), 2);
    }

    @AfterMethod
    public void afterSubstractMethod() {
        System.out.println("Test for substract ended.");
    }

    @BeforeMethod
    public void beforeMultiplyMethod() {
        System.out.println("Test for multiply starts.");
    }

    @Test
    public void testMultiplyMethod() {
        calculator = new CalculatorForHomework();
        Assert.assertEquals(calculator.multiply(10, 4), 40);
    }

    @AfterMethod
    public void afterMultipyMethod() {
        System.out.println("Test for multiply ended.");
    }

    @BeforeMethod
    public void beforeDivideMethod() {
        System.out.println("Test for divide starts.");
    }

    @Test
    public void testDivideMethod() {
        calculator = new CalculatorForHomework();
        Assert.assertEquals(calculator.divide(8, 2), 4.0);
    }

    @AfterMethod
    public void afterDivideMethod() {
        System.out.println("Test for divide ended.");
    }

    @AfterClass
    public void afterCalculatorTestH() {
        System.out.println("Calculator testing ended.");
    }
}

