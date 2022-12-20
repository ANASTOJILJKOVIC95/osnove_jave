package p20_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jedan = -1;
        int dva = -1;
        int tri = -1;
        int cetri = -1;

         while (jedan == 0 || dva == 0 || tri == 0 || cetri == 0){
             System.out.println("Unesite broj");
             int broj = s.nextInt();

             if (broj == 1)
             { jedan = jedan + 1;}

             else if (broj == 2)
             { dva = dva + 1;}

             else if (broj == 3)
             {tri = tri + 1;}

             else if (broj == 4)
             {cetri = cetri + 1;}
         }
        System.out.println("Kraj programa");
    }
}

