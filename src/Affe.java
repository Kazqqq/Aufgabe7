public class Affe extends Säugetier {

    private String farbe;
    private boolean menschenaffe;


    public Affe(String name, String geschlecht, int gewicht, int größe, String lebensRaum, String essen, int alter, String art, String farbe, boolean menschenaffe) {
        super(name, geschlecht, gewicht, größe, lebensRaum, essen, alter, art);
        this.farbe = farbe;
        this.menschenaffe = menschenaffe;
    }
}
