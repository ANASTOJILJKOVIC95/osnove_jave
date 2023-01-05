package java_test;

import java.util.Scanner;

public class Zadatak4 {//Napisati program koji pruza mogucnost postavljanja lozinke.

    // Korisnik prvo unosi lozinku a zatim program od korisnika zahteva unos kojim potvrdjuje lozinku
    // sve dok se ne poklopi sa lozinkom ili dok mu se ne blokira mogucnost postavljanja lozinke.
    // Korisnik moze maksimalno 3 puta da pogresi potvrdu lozinke.
    // Ukoliko se lozinke ne poklapaju ispisati gresku “Lozinke se ne poklapaju”
    // Ukoliko korisnik unese pogresno potvrdu lozinke vise od 3 puta, ispisati poruku
    // “Mogucnost postavljanja lozinke je blokirana”
    // Ukoliko se lozinke poklapaju ispisati “Lozinka je uspesno postavljena”
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite lozinku");
        String lozinka = s.next();
        System.out.println("Potvdite lozinku");
        String potvrda = s.next();
        int brojac = 0;

        while (!potvrda.equals(lozinka) && brojac != 4) {
            System.out.println("Lozinke se ne poklapaju");
            System.out.println("Potvdite lozinku");
            potvrda = s.next();
            brojac = brojac + 1;

        }
        if (brojac == 4) {
            System.out.println("Mogucnost postavljanja lozinke je blokirana");
        } else {
            System.out.println("Lozinka je uspesno postavljena");
        }

    }
}
