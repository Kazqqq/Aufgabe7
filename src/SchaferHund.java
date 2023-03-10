public class SchaferHund extends Hund{


    private String fell;
    private String linie;



    public SchaferHund(String name, String geschlecht, int gewicht, int größe, String lebensRaum, String essen, int alter, String art, int zähne,String fell, String linie) {
        super(name, geschlecht, gewicht, größe, lebensRaum, essen, alter, art, zähne);
        this.fell = fell;
        this.linie = linie;

    }

    public String getFell() {
        return fell;
    }

    public void setFell(String fell) {
        this.fell = fell;
    }

    public String getLinie() {
        return linie;
    }

    public void setLinie(String linie) {
        this.linie = linie;
    }
}




