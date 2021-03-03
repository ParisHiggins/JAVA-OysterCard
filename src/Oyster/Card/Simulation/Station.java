package Oyster.Card.Simulation;

public class Station {
    private String name;
    private int zone;

    public Station(String name, int zone) {
        this.name = name;
        this.zone = zone;
    }

    public String getName() {
        return name;
    }

    public int getZone() {
        return zone;
    }
}
