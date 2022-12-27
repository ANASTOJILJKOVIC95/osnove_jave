package p26_12_2022;

public class Zadatak3 {//Napisati metodu koja stampa zvezdicu sa razmakom.
   // U glavnom programu je potrebno odstampati sledecu sliku koristeci metode koje smo
   public static void main(String[] args) {
       for (int i = 0; i < 10; i++){
           for (int j = 1; j<=10-i; j++){
               simbol();
           }
           System.out.println();
       }

   }
   public static void simbol(){
       System.out.print("* ");
   }
}
