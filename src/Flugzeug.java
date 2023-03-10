public class Flugzeug {

    String airline;
    String modell;
    int baujahr;
    int leistungPS;
    int kilometer;
    int passiegierAnzahl;
    int triebwerkAnzahl;
    int gewicht;

    public Flugzeug(String marke, String modell, int baujahr, int leistungPS, int kilometer, int passiegierAnzahl, int triebwerkAnzahl, int gewicht) {
        this.airline = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.leistungPS = leistungPS;
        this.kilometer = kilometer;
        this.passiegierAnzahl = passiegierAnzahl;
        this.triebwerkAnzahl = triebwerkAnzahl;
        this.gewicht = gewicht;
    }

    public void beschleunigen() {
        System.out.println(modell + " beschleunigt mit bis zu " + leistungPS + " PS");
    }

    public void tanken() {
        System.out.println(modell + " wird getankt...");
    }

    public void kmStandAnzeigen() {
        System.out.println("Der Kilometerstand von diesem " + modell + " steht bei " + kilometer + " km.");
    }
    public void informationenAusgeben() {
        System.out.println("Modell: " + modell);
        System.out.println("Baujahr: " + baujahr);
        System.out.println("Kilometerstand: " + kilometer);
        System.out.println("Das Flugzeug besitzt " + triebwerkAnzahl + " Triebwerke");
        System.out.println("In diesem Flugzeug haben " + passiegierAnzahl + " platz.");
        System.out.println("Das Gewicht des Flugzeuges liegt bei " + gewicht);
    }
}
