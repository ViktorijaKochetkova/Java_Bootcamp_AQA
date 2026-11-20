package module10;

/**
 * This class performs basic math operations
 * It can add, subtract, divide and multiply numbers
 */
public class Calculator {

    /**
     * Adds two numbers
     * @param a first number
     * @param b second number
     * @return sum of two numbers
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds three numbers
     * @param a first number
     * @param b second number
     * @param c third number
     * @return sum of three numbers
     */
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Subtracts the second number from the first
     * @param a first number
     * @param b second number
     * @return result of subtraction
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Divides two numbers
     * @param a first number
     * @param b second number
     * @return result of division
     * @throws ArithmeticException if b is zero
     */
    public int divide(int a, int b) {

        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    /**
     * Multiplies numbers from an array
     * @param numbers array of numbers
     * @return result of multiplication
     * @throws InvalidNumbersException if the array is empty or null
     */
    public int multiply(int[] numbers) throws InvalidNumbersException {

        try {
            if (numbers == null || numbers.length == 0) {
                throw new InvalidNumbersException("No numbers to multiply");
            }

            int result = 1;

            for (int number : numbers) {
                result = result * number;
            }

            return result;
        } catch (InvalidNumbersException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
