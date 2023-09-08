package org.example.climber;

import org.example.interfaces.StartClimbing;
import org.example.interfaces.WarningForOutside;
import org.example.interfaces.WhereAreWeClimbing;

public class FreeClimber extends Climber implements StartClimbing, WhereAreWeClimbing, WarningForOutside {
    public FreeClimber(String name, boolean hasClimbingShoes, boolean usesLiquidChalk, boolean usesChalkPowder, boolean isLocationOutside, String location) {
        super(name, hasClimbingShoes, usesLiquidChalk, usesChalkPowder, isLocationOutside, location);
    }


    // Een freeclimber heeft nooit meer nodig dan dit om te gaan klimmen.

    @Override
    public void startClimbing() {
        System.out.println(name + " is always ready to go free climbing!");
    }

    @Override
    public void locationOfClimbing() {
        WhereAreWeClimbing.super.locationOfClimbing();
        System.out.println("Let's go with " + name + " to " + location + "!");
    }

    @Override
    public void warningForOutside() {
        if (isLocationOutside == true) {
            System.out.println("Don't die " + name + ", please!");
        }
    }

}
