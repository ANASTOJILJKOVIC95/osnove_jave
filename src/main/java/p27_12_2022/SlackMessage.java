package p27_12_2022;

public class SlackMessage {
    public String text;
    public String imeIPrezime;
    public String datumIVreme;

    public void stampa(){
        System.out.println(this.imeIPrezime + " - " + this.datumIVreme);
        System.out.println(this.text);
    }
}


