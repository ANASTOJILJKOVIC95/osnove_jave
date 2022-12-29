package domaci29_12_2022;

public class Zadatak2 {//Kreirati klasu FacebookPost koja ima:
    // Od atributa:
    // ime i prezime korisnika koji je objavio post
    // ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
    // tekst objave
    // broj lajkova
    // broj deljenja
    // gettere za sve atribut
    // settere za sve atribute osim broja lajkova i broja deljenja
    // Od metoda:
    // like(), koja povecava broj lajkova za 1.
    // dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
    // share(), koja povecava broj deljenja za 1
    // print(), koja stampa objavu u formatu:
    // (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
    // (tekst objave
    // Likes (broj lajkova) | Shares (broj deljenja)
    // U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
    public static void main(String[] args) {

        FacebookPost post = new FacebookPost();

        post.setImeIPrezimeKorisnikaPost("Marko Markovic");
        post.setImeIPrezimeKorisnika("Jovan Jovanovic");
        post.setTexObjave("Ovo je text objave");
        post.lajkuj();
        post.lajkuj();
        post.dislajk();
        post.share();
        post.stampaj();

        FacebookPost post2 = new FacebookPost();

        post2.setImeIPrezimeKorisnikaPost("Mirka Markovic");
        post2.setImeIPrezimeKorisnika("Jovana Jovanovic");
        post2.setTexObjave("Ovo je sasvim novi text objave");
        post2.dislajk();
        post2.share();
        post2.lajkuj();
        post2.lajkuj();
        post2.lajkuj();
        post2.dislajk();
        post2.share();
        post2.stampaj();



    }

}
