public class Tier {

    String name;
    int gewicht;
    int größe;
    String lebensRaum;
    String essen;
    int alter;

    public Tier(String name, int gewicht,int größe,String lebensRaum,String essen, int alter){
        this.name = name;
        this.gewicht = gewicht;
        this.größe = größe;
        this.lebensRaum = lebensRaum;
        this.essen = essen;
        this.alter = alter;
    }

    public void name(){
        System.out.println("Der Name ist");
    }
    public void essen(){
        System.out.println("Die Ernährung ist?");
    }

    public void raum (){
        System.out.println("Er/Sie hält sich für gewöhnlich ");

    }
    public void alter () {
        System.out.println("Das Tier ist");

    }

    }
