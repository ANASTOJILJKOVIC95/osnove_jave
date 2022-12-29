package Vezbanje_test;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {//Za potrebe loto igre na srecu, potrebno je napisati program koja ispisuje

    // informaciju da li je odigrana loto kombinacija upravo dobitna kombinacija. Korisnik unosi dva niza
    // oba duzine 7, prvi niz predstavlja odigranu kombinaciju a drugi niz predstavlja izvucenu kombinaciju.
    // Program na kraju ispisuje da li je dobitna kombinacija.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> igraniBrojevi = new ArrayList<Integer>();
        ArrayList<Integer> dobitniBrojevi = new ArrayList<Integer>();

        for (int i = 1; i <= 7; i++) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            igraniBrojevi.add(0, broj);
        }

        for (int i = 1; i <= 7; i++) {
            System.out.println("Unesite izvuceni broj");
            int broj = s.nextInt();
            dobitniBrojevi.add(0, broj);
        }
        if (dobitniBrojevi.equals(igraniBrojevi)) {
            System.out.println("Kombinacija je dobitna");
        } else {
            System.out.println("Kombinacija nije dobitna");
        }
    }
}