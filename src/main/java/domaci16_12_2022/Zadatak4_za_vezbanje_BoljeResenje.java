package domaci16_12_2022;

import java.util.Scanner;

public class Zadatak4_za_vezbanje_BoljeResenje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dimenziju:");
        int dimenzija = s.nextInt();

        for (int i = 1; i <= dimenzija; i++) {
            for (int i1 = 1; i1 <= dimenzija; i1++) {
                System.out.print("_|");
            }
            System.out.println();
        }
    }
}