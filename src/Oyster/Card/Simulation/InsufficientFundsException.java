package Oyster.Card.Simulation;

public class InsufficientFundsException extends Exception {
    InsufficientFundsException(){
        super("Insufficient Funds.");
    }
}
