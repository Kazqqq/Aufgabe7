public class Gorilla extends Affe {


    // Attribute
    private String sozialVerhalten;
    private boolean bedrohteArt;

    // Attribute welche von Affe vererbt wurden
    public Gorilla(String name, String geschlecht, int gewicht, int groesse, String lebensRaum, String essen, int alter, String art, String farbe, boolean menschenaffe, String sozialVerhalten, boolean bedrohteArt) {
        super(name, geschlecht, gewicht, groesse, lebensRaum, essen, alter, art, farbe, menschenaffe);
        this.sozialVerhalten = sozialVerhalten;
        this.bedrohteArt = bedrohteArt;
    }

    // Setter
    public boolean isBedrohteArt() {
        return bedrohteArt;
    }

    public void setBedrohteArt(boolean bedrohteArt) {
        this.bedrohteArt = bedrohteArt;
    }

    // Getter
    public String getSozialVerhalten() {
        return sozialVerhalten;
    }

    public void setSozialVerhalten(String sozialVerhalten) {
        this.sozialVerhalten = sozialVerhalten;
    }
}
