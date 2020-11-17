package fikt.edu.mk;

public class Ocenka
{
    private String predmet;
    private String datumIspit;
    private int ocenka = 5; // default vrednost ako ne e vnesena poinaku

    public Ocenka(int ocenka) {
        this.predmet = predmet;
        this.datumIspit = datumIspit;
        this.ocenka = ocenka;
    }

    public Ocenka ()
    {

    }

    @Override
    public String toString() {
        return "Predmet" +
                "'" + predmet + '\'' +
                ", Polagan na = '" + datumIspit + '\'' +
                ", ocenka = " + ocenka +
                "\n";
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getDatumIspit() {
        return datumIspit;
    }

    public void setDatumIspit(String datumIspit) {
        this.datumIspit = datumIspit;
    }

    public int getOcenka() {
        return ocenka;
    }

    public void setOcenka(int ocenka) {
        this.ocenka = ocenka;
    }
}
