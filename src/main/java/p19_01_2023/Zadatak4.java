package p19_01_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        Disciplina skok = new Disciplina("Skok u dalj", "skakaci");
        Disciplina sprint = new Disciplina("110m s preponama", "trakaci");

        skok.dodajAtleticara(new Skakac("Marko Markovic", 8.9));
        skok.dodajAtleticara(new Skakac("Darko Darkovic", 7.2));
        skok.dodajAtleticara(new Skakac("Zarko Zarkovic", 6.8));

        skok.diskvalifikuj("Marko Markovic");

        skok.stampaj();


        sprint.dodajAtleticara(new Trkac("Nikola Nikolic", 10.1));
        sprint.dodajAtleticara(new Trkac("Usain Bolt", 9.1));
        sprint.dodajAtleticara(new Trkac("Dragan Jankovic", 9.9));
        sprint.diskvalifikuj("Dragan Jankovic");
        sprint.stampaj();

    }
}
