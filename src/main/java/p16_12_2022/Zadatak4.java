package p16_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite jačinu zvuka od 0 do 10: ");
        int jacinaZvuka = s.nextInt();
        System.out.println("<");

        for (int i = 0 ; i < jacinaZvuka; i++){
        System.out.println("|");}


    }
}
