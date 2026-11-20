package module10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAddTwoNumbers() {
        assertEquals(29, calculator.add(47, -18));
    }

    @Test
    public void testAddTwoNegativeNumbers() {
        assertEquals(-39, calculator.add(-23, -16));
    }

    @Test
    public void testThreeNumbers() {
        assertEquals(39, calculator.add(12, -7, 34));
    }

    @Test
    public void testAddThreeWithZero() {
        assertEquals(17, calculator.add(-9, 0,26));
    }

    @Test
    public void testSubtractNumbers() {
        assertEquals(-29, calculator.subtract(18,47));
    }

    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(27, calculator.subtract(-15, -42));
    }

    @Test
    public void testDivideNumbers() {
        assertEquals(13, calculator.divide(156, 12));
    }

    @Test
    public void testDivideNegativeNumber() {
        assertEquals(-12, calculator.divide(-132, 11));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(37, 0);
    }

    @Test
    public void testMultiplyNumbers() throws InvalidNumbersException {
        int[] numbers = {-4, 7, 3};
        assertEquals(-84, calculator.multiply(numbers));
    }

    @Test
    public void testMultiplyWithZero() throws InvalidNumbersException {
        int[] numbers = {11, 0, 6};
        assertEquals(0, calculator.multiply(numbers));
    }

    @Test(expected = InvalidNumbersException.class)
    public void testMultiplyEmptyArray() throws InvalidNumbersException {
        int[] numbers = {};
        calculator.multiply(numbers);
    }

    @Test(expected = InvalidNumbersException.class)
    public void testMultiplyNull() throws InvalidNumbersException {
        calculator.multiply(null);
    }

}
