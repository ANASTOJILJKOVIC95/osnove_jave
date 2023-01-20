package p19_01_2023;

public class Zgrada extends Objekat{
    private int brojStanova;

    public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    public Zgrada(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double racunanjePoreza() {
        return this.brojStanova* koeficjent() * povrsina;

    }

    @Override
    public void stampaj() {
        System.out.println("Adresa je " + this.adresa);
        System.out.println("Zgrada je povrsine" +  this.povrsina +  " kvadrata.");
        System.out.println("Zgrada se nalazi u zoni " + this.zona);
        System.out.println("Porez na zgradu je " +   racunanjePoreza());


    }
}
