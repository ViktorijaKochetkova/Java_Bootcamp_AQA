package module5;

public class AbstractActivity {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.setColor("Blue");

        System.out.println("Rectangle color: " + rec.getColor());
        System.out.println("Rectangle area: " + rec.calculateArea(2, 4, 0));
        System.out.println("Rectangle perimeter: " + rec.calculatePerimeter(2, 4, 0));

        Circle cir = new Circle();
        cir.setColor("Pink");

        System.out.println("Circle color: " + cir.getColor());
        System.out.println("Circle area: " + cir.calculateArea(0, 0, 5));
        System.out.println("Circle perimeter: " + cir.calculatePerimeter(0, 0, 5));
    }
}
