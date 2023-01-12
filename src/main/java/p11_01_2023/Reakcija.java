package p11_01_2023;

public class Reakcija {
    private String emoji;
    private ViberKorisnik reagovaoNaPoruku;

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public ViberKorisnik getReagovaoNaPoruku() {
        return reagovaoNaPoruku;
    }

    public void setReagovaoNaPoruku(ViberKorisnik reagovaoNaPoruku) {
        this.reagovaoNaPoruku = reagovaoNaPoruku;
    }

    public Reakcija(String emoji, ViberKorisnik reagovaoNaPoruku) {
        this.emoji = emoji;
        this.reagovaoNaPoruku = reagovaoNaPoruku;
    }
    public Reakcija(){}
}

