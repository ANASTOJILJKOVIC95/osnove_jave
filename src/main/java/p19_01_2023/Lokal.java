package p19_01_2023;

public class Lokal extends Objekat{
    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }

    public Lokal() {
    }

    @Override
    public double racunanjePoreza() {
        return this.povrsina*koeficjent()*1.3;

    }

    @Override
    public void stampaj() { System.out.println("Adresa je " + this.adresa);
        System.out.println("Lokal je povrsine" +  this.povrsina +  " kvadrata.");
        System.out.println("Lokal se nalazi u zoni " + this.zona);
        System.out.println("Porez na lokal je " + racunanjePoreza());


    }
}
