import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Brett {

    private List<Rute> ruter = new ArrayList<>();

     Random rand = new Random();
    
    
    public Rute flytt(Rute rute, int sum) {
         int nySum = rute.getNummer() + sum - 1;
         return ruter.get(nySum);
    }
    
    public Brett(List<Rute> ruter) {
        this.ruter = ruter;
        for (int i = 0; i < 15; i++) {
            int tilfeldig = rand.nextInt(70) + 15;
            Rute rute1 = ruter.get(tilfeldig);
            rute1.setEgenskap(rand.nextInt(28) - 14);
            if (rute1.getEgenskap() < 0) {
                rute1.setInfo("Du har landet på rute nummer: " + rute1.getNummer() + "\nDenne ruten er en nedoverstige!");
            } else if (rute1.getEgenskap() > 0){
                rute1.setInfo("Du har landet på rute nummer: " + rute1.getNummer() + "\nDenne ruten er en oppoverstige!");
            }
        }
    
    }
    

    public Rute getRute (int i) {
        return ruter.get(i);
    }



}
