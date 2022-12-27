package p26_12_2022;

public class Zadatak5 {//Napisati metodu stampajApsolutnuVrednost,
    // koja stampa apsolutnu vrednost   prosledjene vrednosti.
    public static void main(String[] args) {
        stampajApsolutnuVrednost(-3);
        stampajApsolutnuVrednost(-55);
        stampajApsolutnuVrednost(6);

    }
    public static void stampajApsolutnuVrednost(int broj){
       if (broj < 0){
           System.out.println("Apsolutna vrednost je " +-broj);}
       else {
           System.out.println("Apsolutna vrednost je " + broj);
       }
    }
}


