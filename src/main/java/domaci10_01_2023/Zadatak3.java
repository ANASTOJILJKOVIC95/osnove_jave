package domaci10_01_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Proizvod_zadatak3 proizvod = new Proizvod_zadatak3("123as", "Jagode", 200.5);
        Vaga vaga = new Vaga();
        vaga.setProizvod(proizvod);
        vaga.setMernaJedinica("kg");
        vaga.stampaj(5);
        vaga.setMernaJedinica("lb");
        vaga.stampaj(5);
    }
}
