package p10._01_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        Korisnik s = new Korisnik("Ana", "Stojiljkovic");
        FacebookPost post = new FacebookPost("Ovo je tekst posta");

        post.napisaoPost(s);

        post.stampa();
    }
}
