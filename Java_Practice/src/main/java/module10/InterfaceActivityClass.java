package module10;

    /**
     * This class creates bike and car objects
     * It calls their start and stop methods
     */
public class InterfaceActivityClass  {

    /**
     * Creates vehicles and calls their methods
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Vehicle bike = new Bike();

        bike.start();
        bike.stop();

        System.out.println("----------------------");

        Vehicle car = new Car();

        car.start();
        car.stop();
    }
}
