package domaci13_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Ispit uis = new Ispit("Ustavna istroija srbije", 9,"Dragan Nikolic" );
        Ispit kpp = new Ispit("Krivicno procesno pravo", 8, "Jovan Jovanovic");
        Ispit mjp = new Ispit("Medjunarodno javno pravo", 5, "Marko Markovic");
        Ispit gpp = new Ispit("Gradjansko proscesno pravo", 10, "Irena Kostic");


        Student ana = new Student(78, "Ana Stojiljkovic", "Osnovne" );

        ana.dodajIspit(uis);
        ana.dodajIspit(kpp);
        ana.dodajIspit(mjp);
        ana.dodajIspit(gpp);

        ana.stampaj();
    }
}
