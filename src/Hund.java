

public class Hund extends Saeugetier implements Allesfresser {

    int zaehne;


    public Hund(String name, String geschlecht, int gewicht, int groesse, String lebensRaum, String essen, int alter, String art, int zaehne) {
        super(name, geschlecht, gewicht, groesse, lebensRaum, essen, alter, art);
        this.zaehne = zaehne;

    }

    public void bellen() {

    }

    public int getZaehne() {
        return zaehne;
    }

    public void setZaehne(int zaehne) {
        this.zaehne = zaehne;
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
