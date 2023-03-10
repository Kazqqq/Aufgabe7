public class Säugetier extends Tier {

    int anzahlBeine;
    private boolean säugtJungen;

    public Säugetier(String name, String geschlecht, int gewicht, int größe, String lebensRaum, String essen, int alter, String art) {
        super(name, geschlecht, gewicht, größe, lebensRaum, essen, alter, art);
        this.säugtJungen = säugtJungen;
    }
}
