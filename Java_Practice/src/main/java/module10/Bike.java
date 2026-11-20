package module10;

/**
 * This class represents a bike
 * It implements the vehicle interface
 */

public class Bike implements Vehicle {

    /**
     * Starts the bike
     */
    @Override
    public void start() {
        System.out.println("Bike is ready to ride");
    }

    /**
     * Stops the bike
     */
    @Override
    public void stop() {
        System.out.println("Bike has stopped.");
    }
}
