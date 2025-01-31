import java.util.Random;

public class Kopp {

    Random rand = new Random();
    private int sum;

    public Kopp() {
        this.sum = 0;
    }
    public int getSum() {
        return sum;
    }

    public void trill() {
        this.sum = rand.nextInt(6) + 1;
       
    }

}
