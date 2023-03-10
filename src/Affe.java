public class Affe extends Saeugetier {

    private String farbe;
    private boolean menschenaffe;


    public Affe(String name, String geschlecht, int gewicht, int groesse, String lebensRaum, String essen, int alter, String art, String farbe, boolean menschenaffe) {
        super(name, geschlecht, gewicht, groesse, lebensRaum, essen, alter, art);
        this.farbe = farbe;
        this.menschenaffe = menschenaffe;
    }
}
