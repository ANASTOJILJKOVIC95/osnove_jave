package p21_12_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak7 {
    public static void main(String[] args) {
        //Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva.
        //Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
        //primer jedne zamene:
        //Ako je niz
        //1,2,3,4,5,6,7,8,9,10
        //i prvi random indeks je 4 a drugi random indeks je 6
        //1,2,3,4,7,6,5,8,9,10
        Random random = new Random();
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        int x = random.nextInt(10);
        int y = random.nextInt(10);


        for (int i = 0; i <= 8; i++) {
            brojevi.get(x);
            brojevi.get(y);
            int a = brojevi.get(x);
            int b = brojevi.get(y);
            brojevi.set(x,a);
            brojevi.set(y,b);
        }
    }
}
