package org.example;

import org.example.climber.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//Ik heb gekozen voor een arraylist, omdat het vaste array is, er mogen oneindig veel klimmers aan de lijst toegevoegd worden. Ik heb geen hashmap nodig omdat er geen key is waarop ik wil sorteren. Wel wil ik sorteren verschillende eigenschappen van de klimmers, ik kwam niet helemaal uit hoe ik na een for loop & if statement dan ook echt iets er mee kan. Ik heb aan chatgpt gevraagd hoe ik het beste kan sorteren op liquid chalk, chatgpt gaf aan dat ik ze eruit kan filteren om vervolgens aan een nieuwe arraylist kan toevoegen. Ik vind dit een goede oplossing omdat je op de lange termijn dan ook speciale acties kunt doen op deze specifieke lijst. Zo heb ik een nieuwe arraylist aangemaakt om in de console te laten zien hoeveel klimmers liquid chalk gebruiken en hoeveel powder.

//Ik heb ervoor gekozen om de arraylist niet in een losse class te maken, omdat je eigenlijk elke dag moet kunnen wisselen van discipline en dus elke dag opnieuw een nieuwe lijst met de huidige klimmers van die dag. Op dit moment is het niet nodig om terug te zoeken in voorgaande dagen wie toen heeft geklommen. Dit zal in de toekomst ook niet iets worden wat toegevoegd gaat worden. Mocht dit in de toekomst toch wel als update worden toegevoegd dan moet deze class nog toegevoegd worden en veel van de code omgeschreven worden. Dit is niet ideaal.

public class ClimbingApp {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        ArrayList<Climber> climbers = new ArrayList<>();

        Boulderer kim = new Boulderer("Kim", true, false, true, false, "Bouldergym Sterk");
        climbers.add(kim);
        RopeClimber pim = new RopeClimber("Pim", true, true, true, true, "grigri", true, "the mountains");
        climbers.add(pim);
        FreeClimber gekkie = new FreeClimber("Alex Honnold", true, true, true, true, "whenever, wherever");
        climbers.add(gekkie);

        ArrayList<Climber> liquidChalkUsers = new ArrayList<>();
        for (Climber climber : climbers) {
            if (climber.usesLiquidChalk) {
                liquidChalkUsers.add(climber);
            }
        }

        ArrayList<Climber> chalkPowderUsers = new ArrayList<>();
        for (Climber climber : climbers) {
            if (climber.usesChalkPowder) {
                chalkPowderUsers.add(climber);
            }
        }

        int numberOfChalkPowderUsers = chalkPowderUsers.size();
        int numberOfLiquidChalkUsers = liquidChalkUsers.size();
        int numberOfClimbers = climbers.size();

        System.out.println("Today is: " + formatter.format(date) + ". We have " + numberOfClimbers + " climbers today.");
        System.out.println("Today " + numberOfLiquidChalkUsers + " climbers are liquid chalk users and " + numberOfChalkPowderUsers + " climbers are using powder chalk.");


        kim.startClimbing();
        kim.locationOfClimbing();
        kim.warningForOutside();
        pim.startClimbing();
        pim.locationOfClimbing();
        pim.warningForOutside();
        gekkie.startClimbing();
        gekkie.locationOfClimbing();
        gekkie.warningForOutside();
    }
}