package org.example.climber;


//Een klimmer heeft altijd klimschoentjes aan en gebruikt bijna altijd 'pof' (chalk), je kan 'pof' in poeder variant en in vloeibare variant gebruiken, er is een minimaal aantal klimmers dat geen pof gebruikt en daarom heb ik er een boolean van gemaakt, zodat de mogelijkheid is om hier 'false' aan mee te geven.
// Een klimmer kan meerdere disciplines doen, maar niet tegelijkertijd.
// Een klimmer is abstract, omdat je geen klimmer aanmaakt, maar de discipline die diegene op dat moment gaat uitvoeren.
//In eerste instantie had ik de locaties als losse classes gemaakt, maar dat maakt de applicatie onnodig moeilijk, omdat er eigenlijk niet zo heel veel dingen anders zijn aan de locaties waar je gaat klimmen. Daarom heb ik er toch voor gekozen om er een boolean van te maken of je buiten of binnen gaat klimmen. En de naam van de locatie toe te voegen.

public abstract class Climber {
    String name;
    boolean hasClimbingShoes;
    public boolean usesLiquidChalk;
    public boolean usesChalkPowder;
    public boolean isLocationOutside;
    String location;

    public Climber(String name, boolean hasClimbingShoes, boolean usesLiquidChalk, boolean usesChalkPowder, boolean isLocationOutside, String location) {
        this.name = name;
        this.hasClimbingShoes = hasClimbingShoes;
        this.usesLiquidChalk = usesLiquidChalk;
        this.usesChalkPowder = usesChalkPowder;
        this.isLocationOutside = isLocationOutside;
        this.location = location;
    }

}
