package org.example.climber;

import java.util.ArrayList;

public class ClimbersListToday {

    public ArrayList<Climber> climbers = new ArrayList<>();

    public ArrayList<Climber> getLiquidChalkUsers() {
        var result = new ArrayList<Climber>();
        for (Climber climber : climbers) {
            if (climber.usesLiquidChalk) {
                result.add(climber);
            }
        }
        return result;
    }

    public ArrayList<Climber> getChalkPowderUsers() {
        var result = new ArrayList<Climber>();
        for (Climber climber : climbers) {
            if (climber.usesChalkPowder) {
                result.add(climber);
            }
        }
        return result;
    }

    public ArrayList<Climber> getISGoingOutside() {
        var result = new ArrayList<Climber>();
        for (Climber climber : climbers) {
            if (climber.isLocationOutside) {
                result.add(climber);
            }
        }
        return result;
    }

    public int totalPairOfClimbingShoes() {
        int total = 0;
        for (Climber climber : climbers) {
            total += climber.pairOfClimbingShoes;
        }
        return total;
    }

    public String namesOfClimbersOutside() {
        String names = "";
        for (Climber climber : climbers) {
            if (climber.isLocationOutside) {
                names += climber.name + " & ";
            }
        }
        return names;
    }
}