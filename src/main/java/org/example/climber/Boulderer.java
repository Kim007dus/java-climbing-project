package org.example.climber;
import org.example.interfaces.StartClimbing;
import org.example.interfaces.WarningForOutside;
import org.example.interfaces.WhereAreWeClimbing;

// Een boulderaar heeft in de basis niks meer nodig dan om te gaan klimmen. De uniekheid zit hem in deze class dus vooral in de interfaces die geïmplementeerd en override worden.

public class Boulderer extends Climber implements StartClimbing, WhereAreWeClimbing, WarningForOutside {
    public Boulderer(String name, boolean hasClimbingShoes, boolean usesLiquidChalk, boolean usesChalkPowder, boolean isLocationOutside, String location) {
        super(name, hasClimbingShoes, usesLiquidChalk, usesChalkPowder, isLocationOutside, location);
    }


    @Override
    public void startClimbing() {
        System.out.println(name + " is ready to boulder!");
    }

    @Override
    public void locationOfClimbing() {
        System.out.println("Let's go to " + location + "!");
    }

    @Override
    public void warningForOutside() {
        if (isLocationOutside == true){
            System.out.println("Don't forget to bring your bouldermat " + name + ", please!");

        }
    }
}
