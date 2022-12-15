package p14_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite znak karte na stolu:");
        String znakKarte = s.next();
        System.out.println("Unesite broj karte na stolu:");
        String brojKarte = s.next();
        System.out.println("Unesite znak karte koju igrac zeli da odigra");
        String znakIgrac = s.next();
        System.out.println("Unesite broj karte koju igrac zeli da odigra");
        String brojIgrac = s.next();
        if (brojKarte .equals(brojIgrac) || znakIgrac .equals(znakKarte)) {
            System.out.println("Potez je validan");}
        else {
            System.out.println("Potez nije validan");}
    }
}
