public class AutoTest {
    public static void main(String[] args) {
        Auto testAuto = new Auto("Mercedes", "AMG GT", "Sportwagen", "Benzin", 2022, "schwarz", 280, 0, true);

        testAuto.gefahren();
        System.out.println("Neuwagen: " + testAuto.neuwagen);

        testAuto.nichtGefahren();
        System.out.println("Neuwagen: " + testAuto.neuwagen);

        testAuto.beschleunigen();
        System.out.println(testAuto.marke + " vom dem Modell " + testAuto.modell + " kann in 10sec von 0 auf 100 beschleunigen " );

        testAuto.bremsen();
        System.out.println( testAuto.marke + " von dem Modell " + testAuto.modell + " hat einen kurzen Bremsweg ");

        testAuto.tanken();
        System.out.println(testAuto.marke + " von dem Modell " + testAuto.modell + " tank  " + testAuto.kraftstoffArt);

        testAuto.kmStandAnzeigen();
        System.out.println("Der Kilometerstand vom " + testAuto.marke + testAuto.modell + " steht bei " + testAuto.kilometer );

        testAuto.informationenAusgeben();
        System.out.println("Marke " + testAuto.marke);

        testAuto.informationenAusgeben();
        System.out.println("Modell " + testAuto.modell);

        testAuto.informationenAusgeben();
        System.out.println("Baujahr " + testAuto.baujahr);

        testAuto.informationenAusgeben();
        System.out.println("Farbe " + testAuto.farbe);

        testAuto.informationenAusgeben();
        System.out.println("Fahrzeugtyp" + testAuto.autoArt);
    }

}
