package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

    //Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i
    // koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu
    // od 0 do 4.
    //Primer:
    //Unesite pozicjiu: 2
    //Na pozicji 2 je vrednost 7.
        Scanner s = new Scanner(System.in);
    ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(7);
        brojevi.add(6);
        brojevi.add(33);
        System.out.println("Unesite poziciju od 0 do 4 ");
        int p = s.nextInt();

        brojevi.get(p);
        System.out.println("Vrednost Vase pozicije je " + brojevi.get(p));
    }
}

