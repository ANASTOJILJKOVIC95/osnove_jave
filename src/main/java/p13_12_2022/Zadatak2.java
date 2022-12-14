package p13_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
        //        Napisati program koji na ekranu stampa podatke u formatu:
//        Sifra [SIFRA PROIZVODA]
//[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//[BOJA], [VELICINA]
        String sifraProizvoda = "x932k20";
        String nazivProivoda = "Nike Patike";
        int cena = 23;
        int popust = 20;
        String boja = "plava";
        double broj = 23.5;
        System.out.println(sifraProizvoda);
        System.out.println(nazivProivoda + "-" + cena + "-" + popust + "%");
        System.out.println(boja + ", " + broj);
    }
}
