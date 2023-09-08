package org.example.climber;

import org.example.interfaces.StartClimbing;
import org.example.interfaces.WarningForOutside;
import org.example.interfaces.WhereAreWeClimbing;

public class RopeClimber extends Climber implements StartClimbing, WhereAreWeClimbing, WarningForOutside {
    boolean hasClimbingHarness;
    String sortBelayDevice;

    public RopeClimber(String name, boolean hasClimbingShoes, boolean usesLiquidChalk, boolean usesChalkPowder, boolean hasClimbingHarness, String sortBelayDevice, boolean isLocationOutside, String location) {
        super(name, hasClimbingShoes, usesLiquidChalk, usesChalkPowder, isLocationOutside, location);
        this.hasClimbingHarness = hasClimbingHarness;
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
