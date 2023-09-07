package org.example.goclimbingyes;

//Ik heb hier voor een interface gekozen, omdat alle klimmers ergens gaan klimmen en ik dat met een methode wil laten zien in de console. Ik override deze interface per soort klimmer, om de tekst per klimmer te kunnen aanpassen.

public interface WhereAreWeClimbing {

        default void locationOfClimbing(){
            System.out.println("Where are we climbing?");
        }
    }

