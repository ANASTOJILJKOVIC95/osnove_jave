package Vezbanje_test;

import java.util.Scanner;

public class Zadatak2 {//Napisati program koji učitava brojeve od korisnika dok ne unese dve nule
    // zaredom.Na kraju programa ispisati sumu unetih brojeva
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int nula = 0;
        int suma = 0;

        while (nula != 2) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            if (broj != 0){
                suma = suma + broj;
                nula = 0;}
            else if (broj == 0){ nula = nula + 1;
            }
        }
        System.out.println("Suma otkucanih brojeva je " + suma);
    }
}