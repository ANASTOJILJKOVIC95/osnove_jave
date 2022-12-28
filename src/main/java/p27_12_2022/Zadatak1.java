package p27_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Racun prviRacun = new Racun();
        prviRacun.broj ="12020202";
        prviRacun.imeIPrezime = "Ana Stojioljkovic";
        prviRacun.stanje = 1000000;
        System.out.println("Broj racuna " + prviRacun.broj + " " +
                prviRacun.imeIPrezime + ", stanje na racunu " + prviRacun.stanje);


        Racun drugiRacun = new Racun();
        drugiRacun.broj ="1202020636363632";
        drugiRacun.imeIPrezime = "Maja Markovic";
        drugiRacun.stanje = 10000;
        System.out.println("Broj racuna " + drugiRacun.broj + " " +  drugiRacun.imeIPrezime
                + ", stanje na racunu " + drugiRacun.stanje);

        System.out.println("Unesite sumu");
        int suma = s.nextInt();

        prviRacun.stanje = prviRacun.stanje - suma;
        drugiRacun.stanje = drugiRacun.stanje + suma;

        System.out.println("Broj racuna " + prviRacun.broj+  " " +
                prviRacun.imeIPrezime + ", stanje na racunu " + prviRacun.stanje);
        System.out.println("Broj racuna " + drugiRacun.broj + " " +  drugiRacun.imeIPrezime
                + ", stanje na racunu " + drugiRacun.stanje);


    }
}
