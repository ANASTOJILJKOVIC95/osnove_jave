package p13_01_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String imeIPrezime;
    private String tekstObjave;
    private ArrayList<Reakcija> reakcije;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }

    public FacebookPost(String imeIPrezime, String tekstObjave) {
        this.imeIPrezime = imeIPrezime;
        this.tekstObjave = tekstObjave;
        this.reakcije = new ArrayList<>();
    }

    public FacebookPost() {
        this.reakcije = new ArrayList<>();
    }

    public void reaguj(Reakcija reakcija) {
        for (int i = 0; i < this.reakcije.size(); i++) {
            if(this.reakcije.get(i).getImeIPrezime().equals(reakcija.getImeIPrezime())) {
                this.reakcije.remove(i);
            }
        }
        this.reakcije.add(reakcija);
    }

    public int racunanjeReakcija(String tipReakcije) {
        int counter = 0;
        for (int i = 0; i < this.reakcije.size(); i++) {
            if (this.reakcije.get(i).getTipReakcije().equals(tipReakcije)) {
                counter++;
            }
        }
        return counter;}
    public void stampaj(){
        System.out.println(this.imeIPrezime);
        System.out.println(this.tekstObjave);

        System.out.print("Lajk " + this.racunanjeReakcija("lajk") + " | ");
        System.out.print("Srce " + this.racunanjeReakcija("srce") + " | ");
        System.out.print("Smajli " + this.racunanjeReakcija("smajli") + " | ");
        System.out.print("Cry " + this.racunanjeReakcija("cry") + " | ");

        }
    }


