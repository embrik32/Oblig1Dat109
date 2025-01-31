import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    Rute startrute;
    String[] navn = new String[5];

    navn[0] = "Truls";
    navn[1] = "Petter";
    navn[2] = "Kristian";
    navn[3] = "Ove";
    navn[4] = "Stian";

    List<Rute> ruter1 = new ArrayList<>(100);  
    for (int i = 0; i < 100; i++){
     ruter1.add(i, new Rute("Du har landet på rute nummer: " + (i+1), 0, (i+1)));
    }
    
    Brett brett1 = new Brett(ruter1);
    startrute = ruter1.get(0);
    List<Spiller> spillere1 = new ArrayList<>(navn.length);
     for (int i = 0; i < navn.length; i++) {
         spillere1.add(i, new Spiller(navn[i], brett1, startrute));
     }

    Stigespill spill1  = new Stigespill(brett1, spillere1);
    spill1.start();
    }
   
    
}

