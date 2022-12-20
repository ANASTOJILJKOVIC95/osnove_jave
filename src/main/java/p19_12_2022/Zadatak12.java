package p19_12_2022;

import java.util.Scanner;

public class Zadatak12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite n");
        int n = s.nextInt();


        for (int i = 1; i<=n; i++ ) {
            System.out.println("Unesite password: ");
            String password = s.next();
            int poeni = 0;
            int duzina = password.length();
            if (duzina < 8) {
                poeni = poeni + 0;
            } else if (duzina > 8) {
                poeni = poeni + 1;
            }

            if (password.contains("@")) {
                poeni = poeni + 1;
            } else if (!password.contains("@")) {
                poeni = poeni + 0;
            }

            System.out.println(poeni);}

    }
}

