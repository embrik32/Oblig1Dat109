import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;


public class StigespillTest {

    Spiller spiller1;
    List<Spiller> spillere1;
    Brett brett1;
    String[] navn;


    @BeforeEach
    public void foerHverTest() {
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
    
    this.brett1 = new Brett(ruter1);
    startrute = ruter1.get(0);
    spillere1 = new ArrayList<>(navn.length);
     for (int i = 0; i < navn.length; i++) {
         spillere1.add(i, new Spiller(navn[i], brett1, startrute));
     }

    }

    @Test
    public void spiller1SkalHeteTruls() {
        Spiller spiller1 = spillere1.get(0);
        assertEquals("Truls", spiller1.getNavn());

    }

    @Test
    public void endreNavn() {
        Spiller spiller1 = spillere1.get(0);
        spiller1.setNavn("Thomas");
        assertEquals("Thomas", spiller1.getNavn());
        
    }

    @Test
    public void brikke1SkalHeteTruls() {
        Spiller spiller1 = spillere1.get(0);
        Brikke brikke1 = spiller1.getBrikke();
        assertEquals("Truls", brikke1.getId());
    }

    @Test
    public void brikke1SkalStaPaRute1() {
        Spiller spiller1 = spillere1.get(0);
        Brikke brikke1 = spiller1.getBrikke();
        Rute rute0 = brett1.getRute(0);
        assertEquals(rute0, brikke1.getRute());
        assertEquals(1, brikke1.getRute().getNummer());
    }
    


}
