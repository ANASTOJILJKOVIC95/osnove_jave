package p26_12_2022;

public class Zadatak4 {//Napisati funkciju koja stampa zbir, razliku,
    // proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni parametri funkcije.
    // U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim
    // vrednostima.
    public static void main(String[] args) {
        matematika(10,5);
        System.out.println();
        matematika(20, 2);
    }
    public static void matematika(int prviBroj, int drugiBroj){
        int zbir = prviBroj + drugiBroj;
        int razlika = prviBroj - drugiBroj;
        int proizvod = prviBroj * drugiBroj;
        int kolicnik = prviBroj / drugiBroj;
        System.out.println("Zbir je " + zbir);
        System.out.println("Razlika je " + razlika);
        System.out.println("Proizvod je " + proizvod);
        System.out.println("Kolicnik je " + kolicnik);

    }
}
