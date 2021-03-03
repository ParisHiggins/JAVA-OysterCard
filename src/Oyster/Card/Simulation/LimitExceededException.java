package Oyster.Card.Simulation;

public class LimitExceededException extends Exception {
    LimitExceededException(String message) {
        super(message);
    }
}
