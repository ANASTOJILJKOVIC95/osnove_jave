package domaci26_12_2022;

import java.util.Scanner;

public class Zadatak8 {//)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
    // U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj");
        int a = s.nextInt();
        System.out.println("Unesite drugi broj");
        int b = s.nextInt();
        System.out.println("Unesite treci broj");
        int c = s.nextInt();
        System.out.println("Najmanji broj je " + najmanjiBroj(a,b,c));
    }
    public static int najmanjiBroj(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < a && c < b){
            return c;
        }else {return 0;}
    }
}

