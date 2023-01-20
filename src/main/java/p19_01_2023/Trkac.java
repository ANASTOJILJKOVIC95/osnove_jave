package p19_01_2023;

public class Trkac extends Atleticar{
    public Trkac(String imeIPrezime, double rezultat) {
        super(imeIPrezime, rezultat);
    }

    public Trkac() {
    }

    @Override
    public boolean daLiJeBolji(Atleticar a) {
        if (this.rezultat < a.rezultat) {
            return true;
        } else {
            return false;
        }
    }
}
