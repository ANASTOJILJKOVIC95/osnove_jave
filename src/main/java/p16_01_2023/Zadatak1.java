package p16_01_2023;

public class Zadatak1{
    public static void main(String[] args) {

        Student a = new Student("Ana Stojiljkovic", "31051995", 78, 40000);
        a.stampaj();
        Profesor b = new Profesor("Jovan Jovanovic", "231219970", "Matematika", 100000);
        b.stampaj();
        a.umanjiDug( 2000);
        a.stampaj();

        b.povecajPlatu(10);
        b.stampaj();

    }
}
