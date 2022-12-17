package domaci16_12_2022;

import java.util.Scanner;

public class Zadatak4_za_vezbanje_PrvobitnoResenje {
    public static void main(String[] args) {
        //  (Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dimenziju tabele: ");
        int dimenzija= s.nextInt();
        int povrsina = dimenzija * dimenzija;

        for (int i = 1; i <= povrsina; i++) {
            System.out.print("_|");
            if (i % dimenzija == 0) {
                System.out.println("");
            }
            }
        }
    }



