package Oyster.Card.Simulation;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        Station BHP = new Station("Bush Hill Park", 4);
        Station LVPS = new Station("Liverpool Street", 1);
        Station SD = new Station("Shoreditch", 3);
        Station OX = new Station("Oxford Circus", 2);
        Journey parisJJ = new Journey(BHP);
        JourneyLog parisJourneys = new JourneyLog();

        Oystercard Paris = new Oystercard(parisJourneys);


        Paris.getBalance();
        Paris.topUp(10);
        Paris.touchIn(BHP);
        Paris.touchOut(LVPS);
        Paris.touchIn(SD);
        Paris.touchOut(OX);
        System.out.println(parisJJ);
        Paris.getBalance();






    }
}
