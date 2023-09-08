package org.example.climber;
import java.util.ArrayList;

public class ClimbersListToday {

    public ArrayList<Climber> climbers = new ArrayList<>();
    public ArrayList<Climber> liquidChalkUsers = new ArrayList<>();
    public ArrayList<Climber> chalkPowderUsers = new ArrayList<>();
    public ArrayList<Climber> isGoingOutside = new ArrayList<>();


    public void setLiquidChalkUsers() {
        for (Climber climber : climbers) {
            if (climber.usesLiquidChalk) {
                liquidChalkUsers.add(climber);
            }
        }
    }

    public void setChalkPowderUsers() {
        for (Climber climber : climbers) {
            if (climber.usesChalkPowder) {
                chalkPowderUsers.add(climber);
            }
        }
    }

    public void setIsGoingOutside() {
        for (Climber climber : climbers) {
            if (climber.isLocationOutside) {
                isGoingOutside.add(climber);

            }
        }
    }

}





