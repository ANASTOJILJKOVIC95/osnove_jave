package p10._01_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Reziser r = new Reziser("Mirko", 55);
        Film f = new Film("Filmic" , 1995);

        f.reziserJe(r);

        f.print();



    }
}
