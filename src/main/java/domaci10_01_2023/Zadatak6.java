package domaci10_01_2023;

public class Zadatak6 {
    public static void main(String[] args) {
        Video pesma = new Video("v6tuOipj5mk","Ovo je neka pesma", 188, 0, 0,0);
        YouTubePlayer m = new YouTubePlayer();
        m.ucitajVideo(pesma);
        m.iscrtajPlayer();
        m.premotajUnapred();
        m.premotajUnapred();
        m.premotajUnapred();
        m.aktivirajBioskopskiMod();
        m.iscrtajPlayer();
        m.seruj();


    }
}
