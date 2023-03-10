public class Gorilla extends Affe {

    private String sozialVerhalten;
    private boolean bedrohteArt;

    public Gorilla(String name, String geschlecht, int gewicht, int größe, String lebensRaum, String essen, int alter, String art, String farbe, boolean menschenaffe, String sozialVerhalten, boolean bedrohteArt) {
        super(name, geschlecht, gewicht, größe, lebensRaum, essen, alter, art, farbe, menschenaffe);
        this.sozialVerhalten = sozialVerhalten;
        this.bedrohteArt = bedrohteArt;
    }

    public boolean isBedrohteArt() {
        return bedrohteArt;
    }

    public Gorilla setBedrohteArt(boolean bedrohteArt) {
        this.bedrohteArt = bedrohteArt;
        return this;
    }

    public String getSozialVerhalten() {
        return sozialVerhalten;
    }

    public Gorilla setSozialVerhalten(String sozialVerhalten) {
        this.sozialVerhalten = sozialVerhalten;
        return this;
    }
}
