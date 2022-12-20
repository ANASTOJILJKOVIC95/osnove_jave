package p20_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int nulaSuma= 0;

        while (nulaSuma != 2) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            if (broj == 0) {
                nulaSuma = nulaSuma + 1;
            }
        }
            System.out.println("Kraj programa, unete su dve nule.");

    }
}
