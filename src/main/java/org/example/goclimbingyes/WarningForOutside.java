package org.example.goclimbingyes;

//Deze interface heb ik gemaakt om zowel bij RopeClimber als bij Boulderer een warning te kunnen geven dat ze verschillende spullen niet moeten vergeten en als waarschuwing voor de Free Climber is dat ie niet dood moet gaan. Er is geen default methode, omdat als je binnen gaat klimmen er geen extra waarschuwing nodig is. De methode die ik declareer op beiden is dat als zij parameter 'isLocationOutside' op true hebben gezet, dat er dan een warning message in de console gezet wordt, gespecificeerd met een override per soort klimmer.

public interface WarningForOutside {

    default void warningForOutside () {

    }
}
