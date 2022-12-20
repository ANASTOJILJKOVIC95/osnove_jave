package domaci19_12_2022;

import java.util.Scanner;

public class Zadatak_za_vezbanje_6_predavanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji od korisnika ucitava N jednocifrenih brojeva i
        // od njih formira rezultujuci broj kao na primeru
        System.out.println("Unesite n");
        int n = s.nextInt();
        int zbir = 0;

        for (int i = 1; i <=n; i ++){

            System.out.println("Unesite broj:");
            int broj = s.nextInt();
             zbir = (zbir * 10) + broj;

        }
        System.out.println(zbir);
    }
}
