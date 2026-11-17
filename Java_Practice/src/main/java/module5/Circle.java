package module5;

public class Circle extends Shape {

    public double calculateArea(double length, double breadth, double radius) {

        double res = Math.PI * radius * radius;
        return res;
    }

    public double calculatePerimeter(double length, double breadth, double radius) {

        double res = 2 * Math.PI * radius;
        return res;
    }
}