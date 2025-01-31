
public class Spiller {
    
    /**
     * Navn: navet på spilelr
     * Brikke: brikken som tilhører spiller
     * Brett: brettet spilleren spiller på
     */
    private String navn;
    private Brikke brikke;
    private Brett brett;

    /**
     * Hjelpevariabler til spillTrekk()
     * Teller holder rede på hvor mange ganger en spiller har trillet 6 på en tur
     * Sum holder rede på hvor mange ruten spilleren skal flytte
     */
    int teller = 0;
    int sum;

    /**
     * Konstruktør
     * @param etNavn
     * @param etBrett
     * @param rute1
     */
    public Spiller (String etNavn, Brett etBrett, Rute rute1) {
        this.navn = etNavn;
        this.brikke = new Brikke(etNavn, rute1);
        this.brett = etBrett;
    }

    /**
     * SpillTrekk gjennomfører en tur for en spiller.
     * Spilleren begynner å trille 
     * henter ut hva spilleren har trillet 
     * viser det grafisk i konsoll 
     * henter ruten spilleren(brikken) står på
     * sjekke at spilleren ikke passerer mål, og i så tilfelle sørger for at brikken ikke flyttes (sum=0)
     * henter ruten "sum" antall høyere enn den brikken står på
     * setter brikkens nye plassering til den ruten
     * viser den nye rutens info grafisk i konsoll
     * sjekker om det er en slange- eller stigerute brikken har landet på
     * flytter i så fall brikken etter hvor ang stigen eller slangen er(egenskap verdien)
     * viser ny rute info i konsoll
     * viss sum er 6 (trillet 6) skal det spilles et nytt trekk for spilleren
     * sjekker deretter at spilleren ikke har trillet 6 3 ganger, da sendes spilleren tilbake til start
     * @param kopp
     */
    public void spillTrekk(Kopp kopp) {
        kopp.trill();
        sum = kopp.getSum();
        System.out.println("Triller: " + sum);
        Rute rute = brikke.getRute();
        if (rute.getNummer() + sum > 100) { 
         sum = 0; 
        }
        rute = brett.flytt(rute, sum);
        brikke.setRute(rute);
        System.out.println(rute.getInfo());
        while (rute.getEgenskap() != 0) {
         rute = brett.flytt(rute, rute.getEgenskap());
         brikke.setRute(rute);
         System.out.println(rute.getInfo());
        }
        if (sum == 6) {
            spillTrekk(kopp);
            teller++;
            if (teller == 3) {
                int start1 = rute.getNummer() - 1;
                rute = brett.flytt(rute, -start1);
                brikke.setRute(rute);

            }

        }
     }

     /**
      * hentere og settere for spiller variabler
      * @return
      */
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

    public void resetTeller() {
        this.teller = 0;
    }

}
