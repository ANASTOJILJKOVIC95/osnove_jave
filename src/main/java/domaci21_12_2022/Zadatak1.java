package domaci21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {//.Zadatak
//Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji
// menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//Primer:
//Unesite pozicjiu od 0 do 9: 3
//Unesite novu vrednost: 11
//Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(7);
        brojevi.add(6);
        brojevi.add(33);
        brojevi.add(5);
        brojevi.add(55);
        brojevi.add(78);
        brojevi.add(88);
        brojevi.add(98);

        System.out.println("Unesite pozicjiu od 0 do 9:");
        int k = s.nextInt();
        System.out.println("Unesite novu vrednost:");
        int v = s.nextInt();
        brojevi.set(k,v);
    }
}
