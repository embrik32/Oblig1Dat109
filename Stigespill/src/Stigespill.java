import java.util.ArrayList;
import java.util.List;

public class Stigespill {
    
    /**
     * Spillere: liste av spillere i dette spillet
     * Kopp: kopp med terning (brukses til trilling)
     * Brett: Stigespill brettet
     */
    private List<Spiller> spillere = new ArrayList<>();
    private Kopp kopp;
    private Brett brett;

    /**
     * en tilfeldig variabel som er 0 så lenge det ikke er en vinner i spillet
     */
    private int nummer = 0;

    /**
     * Konstruktør
     * @param brett1
     * @param spillere
     */
    public Stigespill(Brett brett1, List<Spiller> spillere) {
        this.brett = brett1;
        this.kopp = new Kopp();
        this.spillere = spillere;

    }
   
    /**
     * Spiller en runde så lenge det ikke er funnet en vinner
     */
    public void start() {
            while (nummer == 0){
            spillRunde();
        }

        
    }

    /**
     * Spill runde henter en og en spiller fra "spillere" listen og lar spilleren gjennomføre trekkene sine
     * sjekker tilslutt om spilleren har nådd mål (spilleren(brikken) står på rute 100(mål))
     * Endrer i såfall "vinner" variabelen "nummer" til 2 og hopper over resten av spillerene
     */
    private void spillRunde() {
     for (int a = 0; a < spillere.size(); a++) {
        Spiller spiller1 = spillere.get(a);
        System.out.println("\nSpiller nå: " + spiller1.getNavn());
        spiller1.spillTrekk(kopp);
        spiller1.resetTeller();
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