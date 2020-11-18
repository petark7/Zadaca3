package fikt.edu.mk;

import java.util.Arrays;

public class Student extends Covek
{
    // niza od ocenki za Student
    Ocenka[] ocenki = new Ocenka[4];

    public Student(int godini, String ime, String prezime) {
        super(godini, ime, prezime);
    }

    public Student ()
    {

    }


    public void setOcenka(Ocenka o)
    {
        for (int n = 0; n < ocenki.length; n++)
        {
            if (ocenki[n] == null)
            {
                ocenki[n] = o;
                break;
            }
        }

    }

    public void getProsek()
    {
        float prosek;
        float temp = 0;
        float counter = 0;

        for (int n = 0; n < ocenki.length; n++)
        {
            if (ocenki[n] != null)
            {
              temp += ocenki[n].getOcenka();
              counter += 1;
            }
        }
        prosek = temp / counter;
        System.out.println("Prosekot za studentot " + this.getIme() + " " + this.getPrezime() + " e: " + prosek);
    }

    public Ocenka[] getOcenki() {
        return ocenki;
    }

    public void setOcenki(Ocenka[] ocenki) {
        this.ocenki = ocenki;
    }

    @Override
    public String toString() {
        return "Informacii za studentot " + this.getIme() + " " + this.getPrezime() + "\n" +
                " " + Arrays.toString(ocenki);
    }
}
