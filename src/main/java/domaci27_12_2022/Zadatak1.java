package domaci27_12_2022;

import java.util.Scanner;

public class Zadatak1 {//Napisati klasu Proizvod koja ima atribute
    // naziv proizvoda (String)
    // cenu proizvoda (double)
    // težinu proizvoda u gramima. (double)
    // i metode:
    // stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
    // konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u
    // koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
    // Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
    // Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
    // U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

      public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

          Proizvod proizvod1 = new Proizvod();
          proizvod1.naziv = "kupus";
          proizvod1.cena = 20;
          proizvod1.tezina = 1500;
          proizvod1.stampa();

          System.out.println("Unesite jedinicu:");
          String jedinica = s.next();
          System.out.println("Tezina u " + jedinica + " " + proizvod1.tezina(jedinica));

          Proizvod proizvod2 = new Proizvod();
          proizvod2.naziv = "paprika";
          proizvod2.cena = 15;
          proizvod2.tezina = 2500;
          proizvod2.stampa();

          System.out.println("Unesite jedinicu:");
          String jedinica2 = s.next();
          System.out.println("Tezina u " + jedinica2 + " " + proizvod2.tezina(jedinica2));
      }

}
