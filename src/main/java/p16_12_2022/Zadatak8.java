package p16_12_2022;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost A ");
        int a = s.nextInt();
        System.out.println("Unestie vrednost B");
        int b = s.nextInt();
        for (int i = 1; i <11 ; i++){
            if (a != i && b!=i){
                System.out.print(i + " ");
                }
        }

    }
}
