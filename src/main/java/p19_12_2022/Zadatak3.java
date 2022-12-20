package p19_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a");
        int n = s.nextInt();
        System.out.println("Unesite b");
        int k = s.nextInt();
        int p = 1;
      int stepen = n * n;
        for (int i = 1; i <= k; i++ ){
            p = p * n;
        }
        System.out.println("Stepen je " + p);
    }
}
