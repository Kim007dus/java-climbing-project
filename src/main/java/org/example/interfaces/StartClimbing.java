package org.example.interfaces;

//Ik heb hier voor een interface gekozen, omdat alle klimmers gaan starten met klimmen en ik dat met een methode wil laten zien in de console. Ik override deze interface per soort klimmer, om de tekst per discipline te kunnen aanpassen.

public interface StartClimbing {
            default void startClimbing(){
            System.out.println("We are ready to go!");
        }
    }

