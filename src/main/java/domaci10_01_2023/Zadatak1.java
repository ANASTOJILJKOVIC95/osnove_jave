package domaci10_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Autor marko = new Autor("Marko", "Markovic");
        Knjiga a = new Knjiga("66-66", "Markova knjiga", 2018, marko);
        Autor jovan = new Autor("Jovan", "Jovanovic");
        Knjiga b = new Knjiga("213142-22", "Zmaj", 1990, jovan);
        Autor marija = new Autor("Marija", "Marijanovic");
        Knjiga c= new Knjiga("1111111", "Marijina knjiga", 2005, marija);

       a.print();
       b.print();
       c.print();
    }
}
