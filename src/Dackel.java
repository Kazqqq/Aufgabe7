public class Dackel extends Hund{

    private String fell;
    private String ursprung;

    public Dackel(String name, String geschlecht, int gewicht, int größe, String lebensRaum, String essen, int alter, String art, int zähne, String fell, String ursprung) {
        super(name, geschlecht, gewicht, größe, lebensRaum, essen, alter, art, zähne);
        this.fell = fell;
        this.ursprung = ursprung;

    }

    public String getFell() {
        return fell;
    }

    public void setFell(String fell) {
        this.fell = fell;
    }

    public String getUrsprung() {
        return ursprung;
    }

    public void setUrsprung(String ursprung) {
        this.ursprung = ursprung;
    }
}
