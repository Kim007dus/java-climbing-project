package org.example;
import org.apache.commons.lang3.StringUtils;
import org.example.climber.Boulderer;
import org.example.climber.ClimbersListToday;
import org.example.climber.FreeClimber;
import org.example.climber.RopeClimber;
import java.text.SimpleDateFormat;
import java.util.Date;

//In deze applicatie maak je elke dag een nieuwe 'klimmerslijst' aan. Deze lijst wordt opgeslagen in een arraylist in de class ClimberListToday, daar staan ook alle methodes die door de lijsten heen iteren om bepaalde uitkomsten in de console te kunnen printen. Deze methodes roep ik aan, nadat de klimmers zijn toegevoegd aan de lijst, omdat ze anders niet meegenomen worden in de methode.

//Ik heb gekozen voor een arraylist, er mogen oneindig veel klimmers aan de lijst toegevoegd worden. Ik heb geen hashmap nodig omdat er geen key is waarop ik wil sorteren. Wel wil ik sorteren op verschillende eigenschappen van de klimmers, ik kwam niet helemaal uit hoe ik na een for loop & if statement dan ook echt iets er mee kan. Ik heb aan chatgpt gevraagd hoe ik het beste kan sorteren op liquid chalk, chatgpt gaf aan dat ik ze eruit kan filteren om vervolgens aan een nieuwe arraylist kan toevoegen. Ik vind dit een goede oplossing omdat je zo makkelijk het totaal aantal klimmers met bepaalde eigenschappen kan zien. Zo heb ik een nieuwe arraylist aangemaakt om in de console te laten zien hoeveel klimmers liquid chalk gebruiken en hoeveel powder.


public class ClimbingApp {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        ClimbersListToday climbersListToday = new ClimbersListToday();

        Boulderer kim = new Boulderer("Kim", 1, false, true, false, "Bouldergym Sterk");
        climbersListToday.climbers.add(kim);
        RopeClimber pim = new RopeClimber("Pim", 2, true, true, true, "the mountains", "GriGri");
        climbersListToday.climbers.add(pim);
        FreeClimber gekkie = new FreeClimber("Alex Honnold", 3, true, true, "whenever, wherever");
        climbersListToday.climbers.add(gekkie);
        Boulderer peter = new Boulderer("Peter", 2, false , true, true, "Fontainebleau");
        climbersListToday.climbers.add(peter);

        int numberOfChalkPowderUsers = climbersListToday.getChalkPowderUsers().size();
        int numberOfLiquidChalkUsers = climbersListToday.getLiquidChalkUsers().size();
        int numberOfClimbersOutside = climbersListToday.getISGoingOutside().size();
        int numberOfClimbers = climbersListToday.climbers.size();
        int totalPairsOfClimbingShoes = climbersListToday.totalPairOfClimbingShoes();
        String namesOfClimbersOutside = climbersListToday.namesOfClimbersOutside();
        String splitConsoleMessage = "--------";



        System.out.println("Today the date is: " + formatter.format(date) + ". We have " + numberOfClimbers + " climbers today.");
        System.out.println(splitConsoleMessage);
        System.out.println("Today " + numberOfClimbersOutside + " climbers are climbing outside. This will be: " + StringUtils.removeEnd(namesOfClimbersOutside, " & ") + ".");
        System.out.println(splitConsoleMessage);
        System.out.println("Today " + numberOfLiquidChalkUsers + " climbers are liquid chalk users and " + numberOfChalkPowderUsers + " climbers are using powder chalk. In total there are " + totalPairsOfClimbingShoes + " pairs of climbing shoes.");
        System.out.println(splitConsoleMessage);
        kim.startClimbing();
        kim.locationOfClimbing();
        kim.warningForOutside();
        System.out.println(splitConsoleMessage);
        peter.startClimbing();
        peter.locationOfClimbing();
        peter.warningForOutside();
        System.out.println(splitConsoleMessage);
        pim.startClimbing();
        pim.locationOfClimbing();
        pim.warningForOutside();
        System.out.println(splitConsoleMessage);
        gekkie.startClimbing();
        gekkie.locationOfClimbing();
        gekkie.warningForOutside();
    }
}