package Oyster.Card.Simulation;

import java.util.List;

public class Journey {
    private Station entryStation;
    private Station exitStation;

    public Journey(Station entryStation){
        this.entryStation = entryStation;
        this.exitStation = getExitStation();
    }

    public Station getEntryStation() {
        return entryStation;
    }

    public Station getExitStation() {
        return exitStation;
    }

    public void exit(Station exitStation){
        this.exitStation = exitStation;
    }

    public boolean isComplete(){
        return this.exitStation != null;
    }

    @Override
    public String toString() {
        return " Entry Station: " + entryStation +
                "\n Exit Station: " + exitStation;
    }
}
