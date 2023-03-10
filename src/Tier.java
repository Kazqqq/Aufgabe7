public class Tier {

    //Attribute
    String name;
    String geschlecht;
    int gewicht;
    int größe;
    String lebensRaum;
    String essen;
    int alter;
    String rasse;

    //Konstruktor
    public Tier(String name,String geschlecht, int gewicht,int größe,String lebensRaum,String essen, int alter, String rasse){
        this.name = name;
        this.gewicht = gewicht;
        this.größe = größe;
        this.lebensRaum = lebensRaum;
        this.essen = essen;
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.rasse = rasse;
    }

    //Methode
    public void name(){
        System.out.println("Der Name des " + rasse + " ist " + name);
    }
    public void essen(){
        System.out.println("Die Ernährung ist?");
    }

    public void raum (){
        System.out.println(geschlecht + "bevorzugt " + lebensRaum + " als Habitat.");

    }
    public void alter () {
        System.out.println("Das Tier ist" + alter + " jahre alt.");

    }

    }
