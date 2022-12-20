package domaci19_12_2022;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Zadatak6_sa_slacka {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji iscrtava coveculjka C na tabli dimenzija 5x5.
       System.out.println("Unesite poziciju");
        int pozicija = s.nextInt();
        int sum= 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {sum= sum+1;
                System.out.print(" |");
                if(sum == pozicija){
                    System.out.print("c");}}
            System.out.println();

            }
        }

    }


