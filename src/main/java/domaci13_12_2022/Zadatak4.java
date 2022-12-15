package domaci13_12_2022;

public class Zadatak4 {
    public static void main(String[] args) {
        //Napisati program koji racuna i ispisuje povrsinu i obim trougla.
        // KOREN BROJA 3 neka bude konstanta 1.73.
        // Za stranicu trougla postavite proizvoljnu vrednost.
        int a = 10;
        double p = 1.73;
        double obim = a*3;
        double povrsina = (p / 4)*(a*a);
        System.out.println("Obim trougla je " + obim);
        System.out.println("Povrsina trougla je " + povrsina);
    }
}
