package domaci19_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji ucitava N brojeva od korisnika i
        // sabira samo trocifrene brojeve.
        System.out.println("Unesite n:");
        int n = s.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++){
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            if (broj >= 100 && broj <= 999){
                suma = suma + broj;}
            }
        System.out.println("Zbir trocifrenih brojeva je: " + suma);
        }
    }

