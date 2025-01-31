import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    /**
     * Konstruerer variabel startrute for å bruke senere ved oppretting av nye spillere
     */
    Rute startrute;

    /**
     * Lager en tabell av stringer på størrelse 5 for å lagre navn til oppretting av spillere.
     * Legger inn 5 navn i den
     */
    String[] navn = new String[5];

    navn[0] = "Truls";
    navn[1] = "Petter";
    navn[2] = "Kristian";
    navn[3] = "Ove";
    navn[4] = "Stian";

    /**
     * Oppretter en tom liste av 100 ruter til brettet.
     * Legger så inn 100 generiske ruter
     */
    List<Rute> ruter1 = new ArrayList<>(100);  
    for (int i = 0; i < 100; i++){
     ruter1.add(i, new Rute("Du har landet på rute nummer: " + (i+1), 0, (i+1)));
    }

    /**
     * Oppretter et nytt brett med de 100 generiske rutene 
     * I den funkjsonen for brett blir også generert tilfeldige slange- og stigeruter.
     * Setter startrute til rute nr.1
     * Opretter spillere med navn fra navnelisten og setter de på samme brettet med startruten som ruten til brikkene
     */
    Brett brett1 = new Brett(ruter1);
    startrute = ruter1.get(0);
    List<Spiller> spillere1 = new ArrayList<>(navn.length);
     for (int i = 0; i < navn.length; i++) {
         spillere1.add(i, new Spiller(navn[i], brett1, startrute));
     }

    /**
     * Oppretter et nytt spill med alle de nødvendige komponentene fra funksjonene ovenfor.
     * Starter spillet som er konstruert.
     */
    Stigespill spill1  = new Stigespill(brett1, spillere1);
    spill1.start();
    }
   
    
}

