package calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    private App calculator = new App();

    @Test
    public void powerTruePositive(){
        assertEquals("Power of integer numbers for True Positive", 4, calculator.Power(2, 2), DELTA);
        assertEquals("Power of double numbers for True Positive", 10.648, calculator.Power(2.2, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Power of two integer numbers for False Positive", 6, calculator.Power(2, 2), DELTA);
        assertNotEquals("Power of two double numbers for False Positive", 7.3, calculator.Power(2.1, 3.2), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Subtracting two integer numbers for True Positive", 2.302, calculator.Logarithm(10), DELTA);
        assertEquals("Subtracting two double numbers for True Positive", 1.442, calculator.Logarithm(3.14), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Subtracting two integer numbers for False Positive", 6, calculator.Logarithm(10), DELTA);
        assertNotEquals("Subtracting two double numbers for False Positive", -7.3, calculator.Logarithm(3.14), DELTA);
    }

    @Test
    public void squareRootTruePositive(){
        assertEquals("Multiplying two integer numbers for True Positive", 2, calculator.SquareRoot(4), DELTA);
        assertEquals("Multiplying two double numbers for True Positive", 0.8, calculator.SquareRoot(1.6), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Multiplying two integer numbers for False Positive", 6, calculator.SquareRoot(4), DELTA);
        assertNotEquals("Multiplying two double numbers for False Positive", 7.3, calculator.SquareRoot(1.6), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Dividing two integer numbers for True Positive", 2, calculator.Factorial(2), DELTA);
        // assertEquals("Dividing two double numbers for True Positive", 14034.407, calculator.Factorial(7.5), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Dividing two integer numbers for True Positive", 1, calculator.Factorial(2), DELTA);
        // assertNotEquals("Dividing two double numbers for True Positive", 0, calculator.divide(7.5), DELTA);
    }


}