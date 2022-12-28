package domaci21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //Napisati program koji ucitava N brojeva i smesta ih u niz.
        // Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n");
        int n = s.nextInt();

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        int sum= 0;

        for (int i = 0; i < n ; i++){
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            brojevi.add(broj);
        }for (int i = 0; i < brojevi.size(); i++) {
           brojevi.get(i);
            if (brojevi.get(i) % 2 == 0){
                sum= sum + 1;}
        }
        System.out.println("U nizu ima " + sum + " parna broja.");
    }
}
