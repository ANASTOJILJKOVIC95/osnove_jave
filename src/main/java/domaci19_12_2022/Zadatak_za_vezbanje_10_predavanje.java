package domaci19_12_2022;

import java.util.Scanner;

public class Zadatak_za_vezbanje_10_predavanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       // Napisati program koji za sve petocifene brojeve radi mirror opciju.
        System.out.println("Unesite petocifreni broj");
        int n = s.nextInt();
        int m = 0;

        for (int i = 1; i <= 5; i++){
            int ostatak = n % 10;
            m= m*10 + ostatak;
            n= n/10;

        }
        System.out.println(m);


    }
}
