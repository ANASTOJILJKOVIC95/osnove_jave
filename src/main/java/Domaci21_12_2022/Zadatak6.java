package Domaci21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class  Zadatak6 {// Napisati program koji ucitava niz
  //  stringova duzine N, tako da ucitavanje elemenata u niz a bude obrnuto.
     public static void main(String[] args) {
         ArrayList<String> b = new ArrayList<String>();
         ArrayList<String> a = new ArrayList<String>();
         Scanner s = new Scanner(System.in);
         System.out.println("Unesite n:");
         int n = s.nextInt();


         for (int i=0; i<n; i++){
             System.out.println("Unesite element");
             String element = s.next();
             b.add(element);
         }
         for (int i = b.size()-1; i>=0; i--){
             b.get(i);
             a.add(b.get(i));
         }

         System.out.println("Niz a: " + a);
  }
}
