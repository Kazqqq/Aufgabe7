public class Saeugetier extends Tier {

    int anzahlBeine;
    private boolean saeugtJungen;

    public Saeugetier(String name, String geschlecht, int gewicht, int groesse, String lebensRaum, String essen, int alter, String art) {
        super(name, geschlecht, gewicht, groesse, lebensRaum, essen, alter, art);
        this.saeugtJungen = saeugtJungen;
        this.anzahlBeine = anzahlBeine;

    }
}
