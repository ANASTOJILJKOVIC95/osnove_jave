package p20_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj");
        int broj = 2109349;

        while (broj >= 1){
            System.out.print(broj % 10);
            broj = broj / 10;
            if (broj >= 1){
                System.out.print(", ");}
        }

    }
}


