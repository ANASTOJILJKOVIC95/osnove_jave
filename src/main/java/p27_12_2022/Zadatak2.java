package p27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
        SlackMessage prouka1 = new SlackMessage();
        prouka1.text = "Kad pijemo kafu?";
        prouka1.imeIPrezime = "Ana Stojiljkovic";
        prouka1.datumIVreme ="26.08.2021 18:55";
        prouka1.stampa();

        SlackMessage prouka2 = new SlackMessage();
        prouka2.text = "Sutra";
        prouka2.imeIPrezime = "Marija Marijanovic";
        prouka2.datumIVreme ="26.08.2021 19:45";
        prouka2.stampa();

    }
}
