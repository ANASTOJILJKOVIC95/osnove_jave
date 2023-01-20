package p19_01_2023;

public class Kuca extends Objekat{
    public Kuca(String adresa, int povrsina, int zona) {
        super(adresa, povrsina, zona);

    }

    @Override
    public double racunanjePoreza() {
       return this.povrsina * koeficjent();

    }

    @Override
    public void stampaj() {
        System.out.println("Adresa je " + this.adresa);
        System.out.println("Kuca je povrsine" +  this.povrsina +  " kvadrata.");
        System.out.println("Kuca se nalazi u zoni " + this.zona);
        System.out.println("Porez na kucu je " +   racunanjePoreza());

    }
}
