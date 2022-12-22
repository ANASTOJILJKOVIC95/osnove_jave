package p21_12_2022;

import java.util.ArrayList;

public class Zadatak1 {
    //Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
    // i prikazuje sumu nultog i zadnjeg elementa tog niza.
    public static void main(String[] args) {

            ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(7);
        brojevi.add(6);
        brojevi.add(33);
        int sum = brojevi.get(0) + brojevi.get(brojevi.size() - 1);
        System.out.println("Zbir prvog i poslednjeg broja je " + sum);
    }
}
