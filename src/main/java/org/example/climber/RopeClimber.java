package org.example.climber;

import org.example.interfaces.StartClimbing;
import org.example.interfaces.WarningForOutside;
import org.example.interfaces.WhereAreWeClimbing;

public class RopeClimber extends Climber implements StartClimbing, WhereAreWeClimbing, WarningForOutside {
    String sortBelayDevice;

    public RopeClimber(String name, int pairOfClimbingShoes, boolean usesLiquidChalk, boolean usesChalkPowder, boolean isLocationOutside, String location, String sortBelayDevice) {
        super(name, pairOfClimbingShoes, usesLiquidChalk, usesChalkPowder, isLocationOutside, location);
        this.sortBelayDevice = sortBelayDevice;
    }

    @Override
    public void startClimbing() {
        System.out.println(name + " is ready to climb!");
    }

    @Override
    public void locationOfClimbing() {
        System.out.println("Let's go with " + name + " to " + location + "!");
    }

    @Override
    public void warningForOutside() {
        if (isLocationOutside == true) {
            System.out.println("Don't forget to bring your rope and helmet " + name + ", please!");

        }
    }


}
