package p13_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Reakcija jedan = new Reakcija("like", "Ana");
        Reakcija dva = new Reakcija("srce", "Marko");
        Reakcija tri = new Reakcija("like","Nikola");
        Reakcija cetri = new Reakcija("cry", "Ana");

        FacebookPost nekiPost = new FacebookPost("Marija", "Zdravo ljudi");
         nekiPost.reaguj(jedan);
         nekiPost.reaguj(dva);
         nekiPost.reaguj(tri);
         nekiPost.reaguj(cetri);

         nekiPost.stampaj();

    }
}
