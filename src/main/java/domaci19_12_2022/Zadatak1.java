package domaci19_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji od korisnika ucitava N
        // brojeva i sabira samo parne brojeve. Na kraju programa prikazati sumu.

        System.out.println("Unesite n:");
        int n = s.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i ++) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            if (broj % 2 == 0) {
                suma = suma + broj;}
        }
        System.out.println("Zbir parnih brojeva je " + suma);
        }
    }

