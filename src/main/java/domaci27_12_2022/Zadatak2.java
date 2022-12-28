package domaci27_12_2022;

import java.util.Scanner;

public class Zadatak2 {//Kreirati klasu SmartAirConditioning koja ima:
    // atribut za marku klime (npr: Samsung, Galanz, Gree, …)
    // atribut za izabranu temperaturu
    // atribut za mod (hladi/greje) - string
    // metodu za stampu (proizvoljno)
    // metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
    // Metoda kao parametar prima temperaturu koja je napolju.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SmartAirConditioning klima1 = new SmartAirConditioning();

        klima1.marka = "Samsung";
        klima1.temperatura = 21;
        klima1.mode = "hladi";
        klima1.stampa();

        System.out.println("Koja je temperatura napolju?");
        int temp = s.nextInt();
        klima1.razlikaUTemperaturi(temp);
        if (klima1.razlikaUTemperaturi(temp)==false){
            System.out.println("Napolju je veca temperatura");}
        else {
            System.out.println("Napolju je manja temperatura");}


        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.marka = "Hisense";
        klima2.temperatura = 29;
        klima2.mode = "greje";
        klima2.stampa();

        System.out.println("Koja je temperatura napolju?");
        int temp2 = s.nextInt();
        klima2.razlikaUTemperaturi(temp2);
        if (klima2.razlikaUTemperaturi(temp2)==false){
            System.out.println("Napolju je veca temperatura");}
        else {
            System.out.println("Napolju je manja temperatura");}


    }

}
