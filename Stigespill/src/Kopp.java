import java.util.Random;

public class Kopp {

    /**
     * Anvendes for å gi tilfeldig tall 1-6 i forbindelse med trilling av terning
     */
    Random rand = new Random();
    /**
     * totalen til terningen
     */
    private int sum;

    /**
     * Konstruerer en kopp som holder rede på hva summen av terning ble
     */
    public Kopp() {
        this.sum = 0;
    }

    /**
     * Hent sum
     * @return
     */
    public int getSum() {
        return sum;
    }

    /**
     * Trille terning, genererer tilfeldig tall 1-6 og setter sum til den valøren
     */
    public void trill() {
        this.sum = rand.nextInt(6) + 1;
       
    }

}
