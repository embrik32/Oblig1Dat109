
public class Rute {

    private String info;
    private int egenskap;
    private int nummer;

    public Rute (String tekst, int verdi, int numm) {
        this.info = tekst;
        this.egenskap = verdi;
        this.nummer = numm;
    }

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
