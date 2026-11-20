package module10;

/**
 * This class represents a car
 * It implements the Vehicles interface
 */
public class Car implements Vehicle {

    /**
     * Starts the car engine
     */
    @Override
    public void start() {
        System.out.println("Car engine is running");
    }

    /**
     * Stops the car engine
     */
    @Override
    public void stop() {
        System.out.println("Car engine is turned off.");
    }
}
