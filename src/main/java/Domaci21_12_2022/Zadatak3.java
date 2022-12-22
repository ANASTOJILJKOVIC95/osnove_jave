package Domaci21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {//Napisati program koji ucitava niz A duzine N,
    // i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            a.add(broj);
        }
        for (int i = 0; i < a.size(); i++) {
            a.get(i);
            if (a.get(i) > 0) {System.out.print (a.get(i) + ", ");
            }
        }
    }
}
