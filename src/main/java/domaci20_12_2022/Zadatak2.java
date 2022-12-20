package domaci20_12_2022;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati program koji ucitava RIMSKE brojeva od korisnika
        // i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
        System.out.println("Unesite rimski broj");
        String a = s.next();

        while(!a.equals("kraj")){
            if (a.equals("I")){
                System.out.println("Arapski: 1");
            } else if (a.equals("V")) {
                System.out.println("Arapski: 5");
            } else if (a.equals("X")) {
                System.out.println("Arapski: 10");
            } else if (a.equals("L")) {
                System.out.println("Arapski: 50");
            } else if (a.equals("C")) {
                System.out.println("Arapski: 100");
            } else if (a.equals("D")) {
                System.out.println("Arapski: 500");
            } else if (a.equals("M")) {
                System.out.println("Arapski 1000");}
            System.out.println("Unesite rimski broj");
            a = s.next();
            }
        System.out.println("Zavrsili smo sa ucenjem rimskih brojeva");
    }
}
