package java_test;

import java.util.Scanner;

public class Zadatak1 {//Napisati program koji za dve unete osobe ispisuje koja je starija. Za svaku osobu se od
    // podataka unosi ime, godina, mesec i dan rodjenja. Na kraju programa ispisati koja je osoba starija.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime prve osobe");
        String ime1 = s.next();
        System.out.println("Unesite godinu rodjenja prve osobe");
        int godina1 = s.nextInt();
        System.out.println("Unesite mesec rodjenja prve osobe");
        int mesec1 = s.nextInt();
        System.out.println("Unesite dan rodjenja prve osobe");
        int dan1 = s.nextInt();

        System.out.println("Unesite ime druge osobe");
        String ime2 = s.next();
        System.out.println("Unesite godinu rodjenja druge osobe");
        int godina2 = s.nextInt();
        System.out.println("Unesite mesec rodjenja druge osobe");
        int mesec2 = s.nextInt();
        System.out.println("Unesite dan rodjenja druge osobe");
        int dan2 = s.nextInt();

        if (godina1 < godina2){
            System.out.println(ime1 + " je stariji");
        } else if (godina1 > godina2) {
            System.out.println(ime2 + " je stariji");
        } else if (godina1 == godina2) {
            if (mesec1 < mesec2){
                System.out.println(ime1 + " je stariji");
            } else if (mesec1 > mesec2 ) {
                System.out.println(ime2 + " je stariji");
            } else if (mesec1 == mesec2) {
                if (dan1 < dan2){
                    System.out.println(ime1 +  " je stariji");
                } else if (dan1 > dan2) {
                    System.out.println(ime2 + " je stariji");
                } else if (dan1 == dan2) {
                    System.out.println("Rodjeni su istog dana");
                }
            }
        }
    }
}
