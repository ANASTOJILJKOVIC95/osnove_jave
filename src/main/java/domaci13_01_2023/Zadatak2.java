package domaci13_01_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
    Kombinacija jedan = new Kombinacija("123*", 1,2,3,4,5,6,7 );
    Kombinacija dva = new Kombinacija("321", 7,6,5,4,3,2,1);
    Kombinacija tri = new Kombinacija("12234", 1,2,3,4,5,6,7);

    Listic loto= new Listic();

    loto.dodajKombinaciju(jedan);
    loto.dodajKombinaciju(dva);
    loto.dodajKombinaciju(tri);

    loto.stampaj();

    if (loto.dobitna(jedan)){
            System.out.println("Cestitamo imate dobitnu kombinaciju");
    } else if (!loto.dobitna(jedan)) {
            System.out.println("Zao nam je, probajte u sledecem kolu");
    }

    if (loto.dobitna(new Kombinacija("222", 5,7,9,8,9,6,3))){
            System.out.println("Cestitamo imate dobitnu kombinaciju");
    } else  {System.out.println("Zao nam je, probajte u sledecem kolu");

    }
    }
}
