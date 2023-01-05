package Vezbanje_test;

import java.util.Scanner;

public class Zadatak2_slack {//Napisati program koji validira unos lozinke sve dok korisnik ne unese
    // validnu. Lozinka je validna ukoliko ima minimum 8 karaktera i
    // sadrzi bar jedan od dva specijalna karaktera a specijalni karakteri su @ i #
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite lozinku");
        String lozinka = s.next();

        while(lozinka.length() < 8 && !lozinka.contains("@") || !lozinka.contains("#")){
            System.out.println("Lozinka nije validna");
            System.out.println(" Unesite novu lozinku");
            lozinka = s.next();
        }
        System.out.println("Uneli ste ispravnu lozinku" );
    }
}
