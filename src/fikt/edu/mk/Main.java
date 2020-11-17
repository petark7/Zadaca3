package fikt.edu.mk;

public class Main {

    public static void main(String[] args) {

        // TEST:
        Student petar = new Student(19, "Petar", "Kuzmanovski");
        Ocenka predmet1 = new Ocenka(7);
        Ocenka predmet2 = new Ocenka(9);
        Ocenka predmet3 = new Ocenka(9);
        Ocenka predmet4 = new Ocenka(10);

        petar.setOcenka(predmet1);
        predmet1.setDatumIspit("11.11.20");
        predmet1.setPredmet("OOP");

        petar.setOcenka(predmet2);
        predmet2.setDatumIspit("10.11.20");
        predmet2.setPredmet("OOP2");

        petar.setOcenka(predmet3);
        predmet3.setDatumIspit("10.11.20");
        predmet3.setPredmet("OOP3");

        petar.setOcenka(predmet4);
        predmet4.setDatumIspit("10.11.20");
        predmet4.setPredmet("OOP4");

        petar.getProsek();
        System.out.println(petar);
    }
}
