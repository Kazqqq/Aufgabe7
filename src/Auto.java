public class Auto {

    String marke;
    String modell;
    String autoArt;
    String kraftstoffArt;
    int baujahr;
    String farbe;
    int leistungPS;
    int kilometer;
    boolean neuwagen;

    public Auto(String marke, String modell, String autoArt, String kraftstoffArt, int baujahr, String farbe, int leistungPS, int kilometer, boolean neuwagen) {
        this.marke = marke;
        this.modell = modell;
        this.autoArt = autoArt;
        this.kraftstoffArt = kraftstoffArt;
        this.baujahr = baujahr;
        this.farbe = farbe;
        this.leistungPS = leistungPS;
        this.kilometer = kilometer;
        this.neuwagen = neuwagen;
    }
    public void gefahren() {
        System.out.println("Der " + marke + " ist kein Neuwagen mehr.");
        neuwagen = false;
    }

    public void nichtGefahren() {
        System.out.println("Der " + marke + " ist ein Neuwagen.");
        neuwagen = true;
    }

    public void beschleunigen() {
        System.out.println(marke + " " + modell + " beschleunigt...");
    }

    public void bremsen() {
        System.out.println(marke + " " + modell + " bremst...");
    }

    public void tanken() {
        System.out.println(marke + " " + modell + " wird getankt...");
    }

    public void kmStandAnzeigen() {
        System.out.println("Der Kilometerstand von diesem " + marke + " " + modell + " steht bei " + kilometer + " km.");
    }
    public void informationenAusgeben() {
        System.out.println("Marke: " + marke);
        System.out.println("Modell: " + modell);
        System.out.println("Baujahr: " + baujahr);
        System.out.println("Farbe: " + farbe);
        System.out.println("Kilometerstand: " + kilometer);
        System.out.println("Ist gefahren: " + neuwagen);
        System.out.println("Fahrzeugtyp: " + autoArt);
    }
}
