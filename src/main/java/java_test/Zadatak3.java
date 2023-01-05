package java_test;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {//Napisati program koji cuva dva niza celih brojeva, jedan za parne brojeve a
    // drugi za neparne brojeve. Program sa tastature ucitava N brojeva koje unosi korisnik i parne
    // brojeve dodaje u npr iz parnih brojeva a neparne brojeve u niz neparnih. Na kraju programa odstampati
    // brojeve oba niza kao i sumu svakog niza.
    // Napomena: Nizovi se stampaju koristeci petlje.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> parni = new ArrayList<Integer>();
        ArrayList<Integer> neparni = new ArrayList<Integer>();
        System.out.println("Unesite n");
        int n = s.nextInt();
        int sumaParni = 0;
        int sumaNeparni = 0;


        for (int i = 0; i < n; i++){
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            if (broj % 2 == 0){
                parni.add(broj);
                sumaParni = sumaParni + broj;
            } else if (broj % 2 != 0 ) {
                neparni.add(broj);
                sumaNeparni = sumaNeparni + broj;
            }
        }
        System.out.println("Parni brojevi su " +  parni);
        System.out.println("Njihov zbir je " + sumaParni);
        System.out.println("Neparni brojevi su " + neparni);
        System.out.println("Njihov zbir je " + sumaNeparni);

    }
}
