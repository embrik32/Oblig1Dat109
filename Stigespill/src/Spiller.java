
public class Spiller {
    
    private String navn;
    private Brikke brikke;
    private Brett brett;

    public Spiller (String etNavn, Brett etBrett, Rute rute1) {
        this.navn = etNavn;
        this.brikke = new Brikke(etNavn, rute1);
        this.brett = etBrett;
    }

    public void spillTrekk(Kopp kopp) {
        kopp.trill();
        Integer sum = kopp.getSum();
        System.out.println("Triller: " + sum);
        Rute rute = brikke.getRute();
        if (rute.getNummer() + sum > 100) { 
         sum = 100 - rute.getNummer(); 
        }
        rute = brett.flytt(rute, sum);
        brikke.setRute(rute);
        System.out.println(rute.getInfo());
        while (rute.getEgenskap() != 0) {
         rute = brett.flytt(rute, rute.getEgenskap());
         brikke.setRute(rute);
         System.out.println(rute.getInfo());
        }
     }

    public String getNavn() {
        return navn;
    }


    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Brikke getBrikke() {
        return brikke;
    }

    public void setBrikke(Brikke brikke) {
        this.brikke = brikke;
    }

    public Brett getBrett() {
        return brett;
    }

    public void setBrett(Brett brett) {
        this.brett = brett;
    }

}
