package Vezbanje_test;

import java.util.Scanner;

public class Zadatak1 {//Napisati program koji za unetu visinu i težinu osobe računa indeks telesne
  //  mase (BMI) i na osnovu tog rezultata osobu raspoređuje u jednu od četiri kategorije.
    //  BMI se računa po formuli
  //  𝐵𝑀𝐼 = 𝑡𝑒𝑧𝑖𝑛𝑎 𝑢 𝑘𝑔
    //  (𝑣𝑖𝑠𝑖𝑛𝑎 𝑢 𝑚)2
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Unesite visinu");
      double visina = s.nextDouble();
      System.out.println("Unesite tezinu");
      double tezina = s.nextDouble();

      double bmi = tezina / (visina * visina);

      if (bmi <= 18.5) {
          System.out.println("Neuhranjenost");
      } else if (bmi > 18.5 && bmi <= 24.99) {
          System.out.println("Normalna tezina");
      } else if (bmi > 24.99 && bmi <= 29.99) {
          System.out.println("Prekomerna tezina");
      } else { System.out.println("Gojaznost");
      }
  }
}

