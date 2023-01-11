package p10._01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Radnik ana = new Radnik("3105");
        ana.setsSS(6);
        ana.setBrojDece(6);
        ana.setStaz(10);
        ana.setImeIprezime("Ana Stojiljkovic");

        Radnik mirko = new Radnik("12345", "Mirko", 3, 5, 10 );

        System.out.println(ana.minuliRad());
        System.out.println(ana.koeficijentSlozenosti());
        System.out.println(ana.plataRadnika());
        System.out.println(ana.kredit());

        System.out.println(mirko.minuliRad());
        System.out.println(mirko.koeficijentSlozenosti());
        System.out.println(mirko.plataRadnika());
        System.out.println(mirko.kredit());

    }
}
