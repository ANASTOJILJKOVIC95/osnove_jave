package p17_01_2023;

public class Trougao extends Figura{
    private int a;

    public Trougao(int a) {
        this.a = a;
    }

    @Override
    public double povrsina() {
        return a*a * 1.734;
    }

    @Override
    public double obim() {
        return 3*a;
    }
}
