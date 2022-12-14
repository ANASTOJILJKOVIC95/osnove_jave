package p13_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {

//    Napisati program koji na ekranu stampa podatke u formatu:
//            [IME I PREZIME]
//            [BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//            [EMAIL]
    String ime = "Ana";
    String prezime ="Stojiljkovic";
    String brojTelefona = "0607050059";
    String ulica = "Bul. Nemanjica 76";
    String grad = "Nis";
    String email = "anastojiljkovic509@gmial.com";
        System.out.println(ime + prezime);
        System.out.println(brojTelefona + ", " + ulica + ", " + grad);
        System.out.println(email);
}
}
