package p26_12_2022;

import java.util.Scanner;

public class Zadatak6_dopuna {  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Unesite n");
    int n = s.nextInt();
    System.out.println("Unesite m");
    int m = s.nextInt();
    for (int i = 1; i <= m; i++){
        zvezdice(i);
    }

}

    public static void zvezdice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}

