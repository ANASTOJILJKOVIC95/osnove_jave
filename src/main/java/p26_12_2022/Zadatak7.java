package p26_12_2022;

import java.util.Scanner;

public class Zadatak7 {//Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N i vraca ga sa negativnom vrednoscu.
  //  Primer: Ako se metoda pozove za N=10, vraca -10
    //  Ako se metoda pozove za N=-11, vraca 11
  public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      System.out.println("Unesite broj");
      int broj = s.nextInt();
      int a = negativniBroj(broj);
      System.out.println(a);

  }
        public static int negativniBroj(int x){
          return -x;}

      }

