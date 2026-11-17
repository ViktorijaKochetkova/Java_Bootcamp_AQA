package module4;

public class CalculatorClient {
    public static void main(String[] args) {

        Calculator calc = new Calculator(Calculator.CALC_TYPE_BASIC);

        System.out.println("Calculator type: " + calc.getCalculatorType());

        int res = calc.add(4, 5);
        System.out.println("Add: " + res);

        int[] num = {2, 3, 4};
        res = calc.multiply(num);
        System.out.println("Multiply: " + res);

        res = calc.divide(10, 2);
        System.out.println("Divide: " + res);

        res = calc.subtract(10, 2);
        System.out.println("Subtract: " + res);
    }
}
