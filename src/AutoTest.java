public class AutoTest {
    public static void main(String[] args) {
        Auto testAuto = new Auto("Mercedes", "AMG GT", "Sportwagen", "Benzin", 2022, "schwarz", 280, 0, true);

        testAuto.gefahren();
        System.out.println("Neuwagen: " + testAuto.neuwagen);
    }

}
