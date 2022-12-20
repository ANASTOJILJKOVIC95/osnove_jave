package p19_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N");
        int n = s.nextInt();
        int vrednost = 0;
        for (int i = 1; i <=n; i++){
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            vrednost = vrednost + broj;
        }
        vrednost = vrednost/n;
        System.out.println(vrednost);
    }
}
