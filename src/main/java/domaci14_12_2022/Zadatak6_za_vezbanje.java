package domaci14_12_2022;

import java.util.Scanner;

public class Zadatak6_za_vezbanje {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        String p = "#";
        System.out.println("Unesite a: ");
        n = s.nextInt();
        if (n < 0) { p = n + " " + p; }
        else { p = p + " " + n; }
        System.out.println(p);
        System.out.println("Unesite b: ");
        n = s.nextInt(); if (n < 0) { p = n + " " + p; }
        else { p = p + " " + n; } System.out.println(p);
        System.out.println("Unesite c: ");
        n = s.nextInt();
        if (n < 0) { p = n + " " + p; }
        else { p = p + " " + n; }
        System.out.println(p);
        System.out.println("Unesite d: ");
        n = s.nextInt();
        if (n < 0) { p = n + " " + p; }
        else { p = p + " " + n; }
        System.out.println(p);

    }
}
