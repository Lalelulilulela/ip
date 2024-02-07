package exceptions;

/**
 * The LeluExceptions class serves as the parent class for custom exceptions specific to the Lelu application.
 */
public class LeluException extends Exception {
    /**
     * Types of error from different tasks.
     */
    public enum ErrorType {
        TODO,
        EVENT,
        DEADLINE,
        FIND
    }
    public LeluException(String message) {
        super(message);
    }
}
