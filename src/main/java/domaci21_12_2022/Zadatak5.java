
package domaci21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {// Napisati program koji ucitava niz a duzine N. Nakon unosa niza a,
    // formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
   // a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        System.out.println("Unesite n");
        int n = s.nextInt();

        for (int i = 0; i<n; i++) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            a.add(broj);
        }
        for (int i = 0; i<a.size(); i++){
            a.get(i);
            if (i<=2){
                int noviBroj = a.get(i);
                b.add(noviBroj);}
            else if (i>2) {
                b.add(1);}
        }
        System.out.println("Niz a: " + a);
        System.out.println("Niz b: " + b);
    }
}


