package domaci13_01_2023;

import java.util.ArrayList;

public class Kombinacija {
    private String idKombinacije;
    private ArrayList<Integer> brojevi;
    private int prvi;
    private int drugi;
    private int treci;
    private int cetvrti;
    private int peti;
    private int sesti;
    private int sedmi;

    public Kombinacija(String idKombinacije, int prvi, int drugi, int treci, int cetvrti,
                       int peti, int sesti, int sedmi) {
        this.idKombinacije = idKombinacije;
        this.brojevi = new ArrayList<>();
        this.brojevi.add(prvi);
        this.brojevi.add(drugi);
        this.brojevi.add(treci);
        this.brojevi.add(cetvrti);
        this.brojevi.add(peti);
        this.brojevi.add(sesti);
        this.brojevi.add(sedmi);
    }

    public Kombinacija() {
        this.brojevi = new ArrayList<>();
    }

    public String getIdKombinacije() {
        return idKombinacije;
    }

    public void setIdKombinacije(String idKombinacije) {
        this.idKombinacije = idKombinacije;
    }

    public int getPrvi() {
        return prvi;
    }

    public void setPrvi(int prvi) {
        this.prvi = prvi;
    }

    public int getDrugi() {
        return drugi;
    }

    public void setDrugi(int drugi) {
        this.drugi = drugi;
    }

    public int getTreci() {
        return treci;
    }

    public void setTreci(int treci) {
        this.treci = treci;
    }

    public int getCetvrti() {
        return cetvrti;
    }

    public void setCetvrti(int cetvrti) {
        this.cetvrti = cetvrti;
    }

    public int getPeti() {
        return peti;
    }

    public void setPeti(int peti) {
        this.peti = peti;
    }

    public int getSesti() {
        return sesti;
    }

    public void setSesti(int sesti) {
        this.sesti = sesti;
    }

    public int getSedmi() {
        return sedmi;
    }

    public void setSedmi(int sedmi) {
        this.sedmi = sedmi;
    }

    public boolean daLiJeIstaKombinacija(Kombinacija k) {
        int brojac = 0;
        for (int i = 0; i < this.brojevi.size(); i++) {
            if (this.brojevi.get(i).equals(k)) {
                brojac++;
            }
        }
        if (brojac == 7) {
            return true;
        }
        return false;
    }

    public void stampa() {
        System.out.println("ID kombinacije:" + idKombinacije);
        System.out.print("Brojevi: ");
        for (int i = 0; i < this.brojevi.size(); i++) {
            System.out.print(this.brojevi.get(i) + ", ");
        }
        System.out.println();
    }
}
