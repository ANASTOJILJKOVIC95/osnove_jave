package p20_12_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int suma= 0;
        System.out.println("Unesite broj ");
        int x = s.nextInt();

        while (suma + x < 100){
            System.out.println("Unesite broj");
            x = s.nextInt();
            suma = suma + x;

        }
        System.out.println("Vrednost je " + suma);
    }
}
