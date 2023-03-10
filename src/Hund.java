

public class Hund extends Saeugetier implements Allesfresser {

    int zähne;


    public Hund(String name, String geschlecht, int gewicht, int größe, String lebensRaum, String essen, int alter, String art, int zähne) {
        super(name, geschlecht, gewicht, größe, lebensRaum, essen, alter, art);
        this.zähne = zähne;

    }

    public void bellen() {

    }

    public int getZähne() {
        return zähne;
    }

    public void setZähne(int zähne) {
        this.zähne = zähne;
    }

    @Override
    public void frisstPflanze() {
        System.out.println("Ich esse manchmal auch Pflanzen.");
    }

    @Override
    public void frisstFleisch() {
        System.out.println("Ich liebe Fleisch!");
    }
}
