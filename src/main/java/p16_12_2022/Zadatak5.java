package p16_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite jačinu zvuka od 0 do 10: ");
        int jacina = s.nextInt();
        System.out.print("<");

        for (int i = 0; i < jacina; i++) {
            System.out.print("|");
        }
         if (jacina == 0); {
            System.out.print("/");}
        }

    }
