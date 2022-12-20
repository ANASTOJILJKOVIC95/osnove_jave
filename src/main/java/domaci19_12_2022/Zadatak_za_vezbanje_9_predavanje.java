package domaci19_12_2022;

import java.util.Scanner;

public class Zadatak_za_vezbanje_9_predavanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Napisati program koji za sve petocifrene brojeve izvlaci
        // sve cifre i stampa ih na ekranu.
        System.out.println("Unesite broj");
        int broj = s.nextInt();
        int n = 5;


        for (int i = 1;  i <=5; i++){
            System.out.print( broj % 10);
            broj = broj / 10;
            if (broj >= 1){
                System.out.print(", ");}
        }


    }
}
