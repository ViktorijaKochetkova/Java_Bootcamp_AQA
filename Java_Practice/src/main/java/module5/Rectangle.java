package module5;

public class Rectangle extends Shape {

    public double calculateArea(double length, double breadth, double radius) {

        return length * breadth;
    }


    public double calculatePerimeter(double length, double breadth, double radius) {

        double res = 2 * (length + breadth);
        return res;
    }
}
