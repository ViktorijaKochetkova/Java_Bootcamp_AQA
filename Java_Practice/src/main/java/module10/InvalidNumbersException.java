package module10;

/**
 * This class represents an exception for invalid numbers
 * It is used in the Calculator class
 */
public class InvalidNumbersException extends Exception {

    /**
     * Creates an exception with a message
     * @param message error message
     */
    public InvalidNumbersException(String message) {
        super(message);
    }
}
