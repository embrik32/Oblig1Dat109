
public class Rute {

    /**
     * Info: tekst som skal vises når en brikke lander på ruten
     * Egenskap: en verdi som avgjør om det er en tom rute, en stige rute eller en slange rute,
     * og hvor stor evt. slangen/stigen er; 0 = tom,  <0 = slange, >0 = stige
     * Nummer: identifiserer vilken rute det er. F.eks. rute 1 er start, rute 100 er mål og 50 er en rute på midten.
     */
    private String info;
    private int egenskap;
    private int nummer;

    /**
     * Konstruktør
     * @param tekst
     * @param verdi
     * @param numm
     */
    public Rute (String tekst, int verdi, int numm) {
        this.info = tekst;
        this.egenskap = verdi;
        this.nummer = numm;
    }

    /**
     * Funksjoner for å hente og sette(endre) variablene til en rute.
     * @return
     */
    public int getNummer() {
        return this.nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setEgenskap(int egenskap) {
        this.egenskap = egenskap;
    }

  
    public int getEgenskap() {
        return this.egenskap;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
