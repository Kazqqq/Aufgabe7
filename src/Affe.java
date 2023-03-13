public class Affe extends Saeugetier {

    // Attrivute
    private String farbe;
    private boolean menschenaffe;

    // Attribute die von Saeugetier vererbt werden
    public Affe(String name, String geschlecht, int gewicht, int groesse, String lebensRaum, String essen, int alter, String art, String farbe, boolean menschenaffe) {
        super(name, geschlecht, gewicht, groesse, lebensRaum, essen, alter, art);
        this.farbe = farbe;
        this.menschenaffe = menschenaffe;
    }
}
