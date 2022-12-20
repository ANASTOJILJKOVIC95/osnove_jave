package p19_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N");
        int n = s.nextInt();
        int zbir = 0;
        for (int i = 1; i <= n; i++){
            System.out.println("Unesite broj");
           int broj = s.nextInt();
            zbir = zbir + broj;
        }
        System.out.println("Zbir je " + zbir);
    }
}
