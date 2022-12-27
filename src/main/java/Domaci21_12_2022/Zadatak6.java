package Domaci21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6 {// Napisati program koji ucitava niz
    //  stringova duzine N, tako da ucitavanje elemenata u niz a bude obrnuto.
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N");
        int n = s.nextInt();

        for (int i = 0; i< n; i++){
            System.out.println("Unesite element");
            a.add(0, s.next());
        }
        System.out.println("Niz a je " + a);

    }
}
