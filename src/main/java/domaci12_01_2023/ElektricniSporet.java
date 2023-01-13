package domaci12_01_2023;

import domaci12_01_2023.Ringla;

public class ElektricniSporet {
    private String marka;
    private int garancija;
    private int maxBrojUkljucenihRingli;
    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;

    public ElektricniSporet(String marka, int garancija, int maxBrojUkljucenihRingli, Ringla goreLevo,
                            Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.marka = marka;
        this.garancija = garancija;
        this.maxBrojUkljucenihRingli = maxBrojUkljucenihRingli;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }

    public String getMarka() {
        return marka;
    }

    public int getGarancija() {
        return garancija;
    }

    public int getMaxBrojUkljucenihRingli() {
        return maxBrojUkljucenihRingli;
    }

    public Ringla getGoreLevo() {
        return goreLevo;
    }

    public Ringla getGoreDesno() {
        return goreDesno;
    }

    public Ringla getDoleLevo() {
        return doleLevo;
    }

    public Ringla getDoleDesno() {
        return doleDesno;
    }
    private int brojac;
    public void pojacaj(int pozicija){
        if (maxBrojUkljucenihRingli > brojac){
            if(pozicija == 1){
                this.goreLevo.pojacaj();
            } else if (pozicija == 2) {
                this.goreDesno.pojacaj();
            } else if (pozicija == 3){
                this.doleLevo.pojacaj();
            } else if (pozicija == 4) {
                this.doleDesno.pojacaj();
        } else if (maxBrojUkljucenihRingli <= brojac){
            this.goreLevo.iskljuci();
            this.goreDesno.iskljuci();
            this.doleLevo.iskljuci();
            this.doleDesno.iskljuci();
            if(pozicija == 1){
                this.goreLevo.pojacaj();
                brojac ++;
            } else if (pozicija == 2) {
                this.goreDesno.pojacaj();
                brojac ++;
            } else if (pozicija == 3){
                this.doleLevo.pojacaj();
                brojac ++;
            } else if (pozicija == 4) {
                this.doleDesno.pojacaj();
                brojac ++;}
        }
    }}
    public void iskljuci (int pozicija){
        if(pozicija == 1){
            this.goreLevo.iskljuci();
        } else if (pozicija == 2) {
            this.goreDesno.iskljuci();
        } else if (pozicija == 3){
            this.doleLevo.iskljuci();
        } else if (pozicija == 4) {
            this.doleDesno.iskljuci();}
    }
    public double potrosnja(int vreme){
    return this.doleDesno.potrosnja(vreme) + this.doleLevo.potrosnja(vreme) +
            this.goreDesno.potrosnja(vreme) + this.goreLevo.potrosnja(vreme);
    }

    public void stampa (){
        System.out.println(this.marka + " " + this.garancija + "godina grancije");
        System.out.println("Ringle: ");
        System.out.println("Gore levo:");
        System.out.println(this.goreLevo.daLiJeRinglaUkljucena());
        System.out.println("Tip ringle: " + this.goreLevo.getTipRingle());
        System.out.println("Jacina: " + goreLevo.getJacina());
        System.out.println("Grejac: " + goreLevo.getJacinaGrejaca() + " kW");

        System.out.println("Gore desno:");
        System.out.println(this.goreDesno.daLiJeRinglaUkljucena());
        System.out.println("Tip ringle: " + this.goreDesno.getTipRingle());
        System.out.println("Jacina: " + goreDesno.getJacina());
        System.out.println("Grejac: " + goreDesno.getJacinaGrejaca() + " kW");

        System.out.println("Dole levo:");
        System.out.println(this.doleLevo.daLiJeRinglaUkljucena());
        System.out.println("Tip ringle: " + this.doleLevo.getTipRingle());
        System.out.println("Jacina: " + doleLevo.getJacina());
        System.out.println("Grejac: " + doleLevo.getJacinaGrejaca() + " kW");

        System.out.println("Dole desno:");
        System.out.println(this.doleDesno.daLiJeRinglaUkljucena());
        System.out.println("Tip ringle: " + this.doleDesno.getTipRingle());
        System.out.println("Jacina: " + doleDesno.getJacina());
        System.out.println("Grejac: " + doleDesno.getJacinaGrejaca() + " kW");
    }


}
