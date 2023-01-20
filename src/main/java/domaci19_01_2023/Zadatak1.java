package domaci19_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Ambalaza pivo = new StaklenaFlasa("34843", "Pivo", 500, 550, 10,true,40);
        Ambalaza vino = new StaklenaFlasa("4589", "vino", 1200, 1400, 0, false, 500);

        Ambalaza sok = new Tetrapak("048936", "sok", 400, 420,true,90);
        Ambalaza mleko = new Tetrapak("584309", "mleko", 500,550,false, 100);

        SuperKartica a = new SuperKartica("3245", "Marko Markovic", 300);
        Korpa korpa = new Korpa();

        korpa.dodajUkorpu(pivo);
        korpa.dodajUkorpu(vino);
        korpa.dodajUkorpu(sok);
        korpa.dodajUkorpu(mleko);

        korpa.izbaciIzKorpe("584309");

        System.out.println("Vas racun je " + korpa.racun(a));

        System.out.println("Cene sa popustom su " );

    }
}
