package Oyster.Card.Simulation;

import javax.naming.LimitExceededException;

public class Oystercard {

    private int balance;
    private static int maxBalance;
    private Journey currentJourney;
    private JourneyLog journeyLog;

    public Oystercard(JourneyLog journeyLog) {
        balance = 10;
        maxBalance = 90;
        this.journeyLog = journeyLog;
    }

    public int getBalance() {
        System.out.println("Your current balance is: £" + balance);
        return balance;
    }

    public void topUp(int amount) throws LimitExceededException {
        if (balance + amount <= maxBalance) {
            this.balance += amount;
            System.out.println("Your balance is now: £" + balance);
        } else {
            throw new LimitExceededException("Maximum balance cannot exceed £" + maxBalance + " Try Again.");
        }
    }

    private void payFare(int fare) throws InsufficientFundsException {
        if (balance >= fare){
            balance -= fare;
        }else{
            throw new InsufficientFundsException();
        }
    }

    public Journey getCurrentJourney() {
        return this.currentJourney;
    }

    public void setCurrentJourney(Journey currentJourney) {
        this.currentJourney = currentJourney;
    }

    public void touchIn(Station station){
        setCurrentJourney(new Journey(station));
    }

    public void touchOut(Station station) throws Exception {
        currentJourney.exit(station);
        int fare = 5;
        payFare(fare);
    }

}















//    public void setBalance(int balance) {
//        this.balance = balance;
//        System.out.println("Your current balance is: £" + balance);
//    }
//
//    public void topUp(int money) {
//        balance += money;
//        if (balance > maxBalance) {
//            balance = maxBalance;
//            System.out.println("Maximum Balance exceeded. Excess has been refunded and your current balance is: £" + balance);
//        } else {
//            System.out.println("Your balance is now: £" + balance);
//        }
//    }
//
//    public void deductFare(int fare){
//        balance -= fare;
//        System.out.println("£"+fare+" deducted. Current balance: £"+balance);
//    }
//
//    public void touchIn(String name, int zone){
//        this.stationName = name;
//        this.zone = zone;
//    }
//
//    public void touchOut(String name, int zone, int fare){
//        deductFare(5);
//
//    }