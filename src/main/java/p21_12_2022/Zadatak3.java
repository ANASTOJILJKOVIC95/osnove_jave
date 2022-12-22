package p21_12_2022;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        //Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji
        // zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(7);
        brojevi.add(6);
        brojevi.add(33);

        int prvi = brojevi.get(0);
        int poslednji = brojevi.get(brojevi.size()-1);
        brojevi.set(0, poslednji);
        brojevi.set(brojevi.size() - 1, prvi);
        System.out.println( "Prvi broj je " + brojevi.get(0) + "poslednji je" +  brojevi.get(brojevi.size()-1));
    }
}
