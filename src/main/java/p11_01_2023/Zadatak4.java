package p11_01_2023;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj sastojaka");
        int brojSastojaka = s.nextInt();
        ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();

        for (int i = 0; i < brojSastojaka; i++) {
            System.out.println("Unesite sastojak");
            String naziv = s.next();
            System.out.println("Unesite cenu");
            int cena = s.nextInt();

            Sastojak x = new Sastojak(naziv, cena);
            sastojci.add(x);
        }
    }
}
