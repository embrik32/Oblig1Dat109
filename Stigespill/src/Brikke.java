
public class Brikke {

    /**
     * Id er navnet på brikken
     */
    private String id;
    /**
     * Rute er ruten brikken står på
     */
    private Rute rute;

    /**
     * Konstruktør for brikke, setter id(navn) og hvilken rute den skal starte på
     * @param id
     * @param rute
     */
    public Brikke(String id, Rute rute) {
        this.id = id;
        this.rute = rute;
    }

    /**
     * henter ruten brikken er plassert på
     * @return
     */
    public Rute getRute() {
        return rute;
    }

    /**
     * Setter ny rute(i praksis flytter brikken)
     * @param rute
     */
    public void setRute(Rute rute) {
        this.rute = rute;
    }

    /**
     * Henter navn
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * setter nytt navn(id)
     */
    public void setId(String id) {
        this.id = id;
    }

    


}
