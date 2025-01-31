import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Brett {

    /**
     * Oppretter en tom liste av ruter som skal danne brettet
     */
    private List<Rute> ruter = new ArrayList<>();

    /**
     * Random anvendes i dannelsen av de tilfeldige stige/slange rutene
     */
     Random rand = new Random();
    
    /**
     * Henter ny rute brikken skal flyttes til
     * @param rute
     * @param sum
     * @return
     */
    public Rute flytt(Rute rute, int sum) {
         int nySum = rute.getNummer() + sum - 1;
         return ruter.get(nySum);
    }
    
    /**
     * Oppretter et nytt brett og genererer 15 tilfeldige stiger eller slanger
     * @param ruter
     */
    public Brett(List<Rute> ruter) {
        this.ruter = ruter;
        for (int i = 0; i < 15; i++) {
            int tilfeldig = rand.nextInt(70) + 15;
            Rute rute1 = ruter.get(tilfeldig);
            rute1.setEgenskap(rand.nextInt(28) - 14);
            if (rute1.getEgenskap() < 0) {
                rute1.setInfo("Du har landet på rute nummer: " + rute1.getNummer() + "\nDenne ruten er en rute med slange! \nDu sklir ned!");
            } else if (rute1.getEgenskap() > 0){
                rute1.setInfo("Du har landet på rute nummer: " + rute1.getNummer() + "\nDenne ruten er en rute med stige! \nDu klatrer opp!");
            }
        }
    
    }
    
    /**
     * Henter rute (i) fra ruter (brettet)
     * @param i
     * @return
     */
    public Rute getRute (int i) {
        return ruter.get(i);
    }



}
