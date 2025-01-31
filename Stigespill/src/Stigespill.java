import java.util.ArrayList;
import java.util.List;

public class Stigespill {
    
    private List<Spiller> spillere = new ArrayList<>();
    private Kopp kopp;
    private Brett brett;

    private int nummer = 0;

    public Stigespill(Brett brett1, List<Spiller> spillere) {
        this.brett = brett1;
        this.kopp = new Kopp();
        this.spillere = spillere;

    }
   

    public void start() {
            while (nummer == 0){
            spillRunde();
        }

        
    }

    private void spillRunde() {
     for (int a = 0; a < spillere.size(); a++) {
        Spiller spiller1 = spillere.get(a);
        System.out.println("\nSpiller nå: " + spiller1.getNavn());
        spiller1.spillTrekk(kopp);
        Brikke brikke1 = spiller1.getBrikke();
        Rute rute1 = brikke1.getRute();
        if (rute1.getNummer() == 100) {
            System.out.println("\nSpiller: " + spiller1.getNavn() + "\nHar vunnet spillet!");
            nummer = 2;
            return;
           }
     }

    }

}