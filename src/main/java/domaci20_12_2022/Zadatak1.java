package domaci20_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati program koji ucitava brojeva od korisnika
        // i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.
        Scanner s = new Scanner(System.in);
        int broj = 1;

        while (broj != 0){
            System.out.println("Unesite broj");
            broj = s.nextInt();
            if (broj < 0){ broj = broj * -1;
                System.out.println(broj);}
            else if (broj>0){
                System.out.println(broj);}

            }

        System.out.println("Uneli ste nulu. Program je zavrsen.");
        }
    }

