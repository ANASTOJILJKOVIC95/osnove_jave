package p10._01_2023;

public class Reziser {
    private String ime;
    private int starost;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public Reziser(String ime, int starost) {
        this.ime = ime;
        this.starost = starost;
    }
}
