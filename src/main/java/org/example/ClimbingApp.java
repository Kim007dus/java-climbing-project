package org.example;

import org.example.climber.*;
import java.text.SimpleDateFormat;
import java.util.Date;

//In deze applicatie maak je elke dag een nieuwe 'klimmerslijst' aan. Deze lijst wordt opgeslagen in een arraylist in de class ClimberListToday, daar staan ook alle methodes die door de lijsten heen iteren om bepaalde uitkomsten in de console te kunnen printen. Deze methodes roep ik aan, nadat de klimmers zijn toegevoegd aan de lijst, omdat ze anders niet meegenomen worden in de methode.

//Ik heb gekozen voor een arraylist, er mogen oneindig veel klimmers aan de lijst toegevoegd worden. Ik heb geen hashmap nodig omdat er geen key is waarop ik wil sorteren. Wel wil ik sorteren op verschillende eigenschappen van de klimmers, ik kwam niet helemaal uit hoe ik na een for loop & if statement dan ook echt iets er mee kan. Ik heb aan chatgpt gevraagd hoe ik het beste kan sorteren op liquid chalk, chatgpt gaf aan dat ik ze eruit kan filteren om vervolgens aan een nieuwe arraylist kan toevoegen. Ik vind dit een goede oplossing omdat je zo makkelijk het totaal aantal klimmers met bepaalde eigenschappen kan zien. Zo heb ik een nieuwe arraylist aangemaakt om in de console te laten zien hoeveel klimmers liquid chalk gebruiken en hoeveel powder.



public class ClimbingApp {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        ClimbersListToday climbersListToday = new ClimbersListToday();

        Boulderer kim = new Boulderer("Kim", true, false, true, false, "Bouldergym Sterk");
        climbersListToday.climbers.add(kim);
        RopeClimber pim = new RopeClimber("Pim", true, true, true, true, "grigri", true, "the mountains");
        climbersListToday.climbers.add(pim);
        FreeClimber gekkie = new FreeClimber("Alex Honnold", true, true, true, true, "whenever, wherever");
        climbersListToday.climbers.add(gekkie);

        climbersListToday.setChalkPowderUsers();
        climbersListToday.setLiquidChalkUsers();
        climbersListToday.setIsGoingOutside();


        int numberOfChalkPowderUsers = climbersListToday.chalkPowderUsers.size();
        int numberOfLiquidChalkUsers = climbersListToday.liquidChalkUsers.size();
        int numberOfClimbersOutside = climbersListToday.isGoingOutside.size();
        int numberOfClimbers = climbersListToday.climbers.size();

        System.out.println("Today is: " + formatter.format(date) + ". We have " + numberOfClimbers + " climbers today. And " + numberOfClimbersOutside + " climbers are climbing outside.");

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