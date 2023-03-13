

public class SchaferHund extends Hund {

    // Attribute
    private String fell;
    private String linie;


    // Attribute die von Hund geerbt werden
    public SchaferHund(String name, String geschlecht, int gewicht, int groesse, String lebensRaum, String essen, int alter, String art, int zähne, String fell, String linie) {
        super(name, geschlecht, gewicht, groesse, lebensRaum, essen, alter, art, zähne);
        this.fell = fell;
        this.linie = linie;

    }

    public boolean istWachhund() {
        return this.getLinie().equals("Arbeitslinie");
    }

    // Getter
    public String getFell() {
        return fell;
    }

    public String getLinie() {
        return linie;
    }

    // Setter
    public void setFell(String fell) {
        this.fell = fell;
    }

    public void setLinie(String linie) {
        this.linie = linie;
    }
}




