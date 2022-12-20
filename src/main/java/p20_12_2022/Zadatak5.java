package p20_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite akciju");
        String akcija = s.next();
        int jacina = 75;

        while (!akcija.contains("play")) {
            if (akcija.contains("pojacaj")) {
                jacina = jacina + 10;
                if (jacina > 100) {
                    jacina = 100;
                } else if (jacina < 0) {
                    jacina = 0;
                }
            } else if (akcija.contains("smanji")) {
                jacina = jacina - 10;
                if (jacina > 100) {
                    jacina = 100;
                } else if (jacina < 0) {
                    jacina = 0;}
            }
            System.out.println("Unesite akciju");
            akcija = s.next();
        }
        System.out.println("Jacina zvuka je" + jacina);
    }
}

