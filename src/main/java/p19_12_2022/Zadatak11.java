package p19_12_2022;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite password: ");
        String password = s.next();

        for (int i = 0; i <= password.length(); i++){
            System.out.print("*");}


    }
}
