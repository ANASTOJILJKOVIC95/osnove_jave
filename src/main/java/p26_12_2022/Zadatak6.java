package p26_12_2022;

import java.util.Scanner;

public class Zadatak6 {//Napisati metodu koja stampa N zvezdica u istom redu,

    // na kraju reda stampa novi red.. Broj zvezdica je odredjen parametrom N.
    //Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
    //N=5, print je=> * * * * *
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n");
        int n = s.nextInt();
        zvezdice(n);

    }

    public static void zvezdice(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

    }
}
