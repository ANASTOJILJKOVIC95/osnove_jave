package domaci17_01_2023;

public class TimeControl extends Control{
    private boolean premotaj;

    public TimeControl(boolean premotaj) {
        this.premotaj = premotaj;
    }
    public TimeControl(){}

    public boolean isPremotaj() {
        return premotaj;
    }

    public void setPremotaj(boolean premotaj) {
        this.premotaj = premotaj;
    }

    @Override
    public void izvrisAkciju(VideoPlayer a) {
        if (premotaj){ a.setTrenutnoVremeVidea(a.getTrenutnoVremeVidea() + 15);
        if (a.getTrenutnoVremeVidea() > a.getDuzinaVide())
        a.setTrenutnoVremeVidea(a.getDuzinaVide());}
        else {a.setTrenutnoVremeVidea(a.getTrenutnoVremeVidea() - 15);
            if (a.getTrenutnoVremeVidea() < 0) {
                a.setTrenutnoVremeVidea(0);}
        }
    }
}
