package Oyster.Card.Simulation;

import java.util.List;

public class JourneyLog {
    private List<Journey> journeyLog;

    public List<Journey> getJourneyLog() {
        return journeyLog;
    }

    public void addJourney(Journey journey) {
        this.journeyLog.add(journey);
    }

    @Override
    public String toString() {
        return "JourneyLog{" +
                "journeyLog=" + journeyLog +
                '}';
    }
}

//    public ArrayList<Journey> getJourneys() {
//        return new ArrayList<Journey>(myJourneys);
//    }
//
//    public JourneyLog(){}
//
//    public void addJourney(Journey journey){
//        myJourneys.add(journey);
//    }
//
//    @Override
//    public String toString() {
//        return myJourneys.toString();
//    }
//}
