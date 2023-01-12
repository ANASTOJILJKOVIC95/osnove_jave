package p11_01_2023;

public class ViberPoruka {
    private String tekst;
    private String vreme;
    private ViberKorisnik porukuPoslao;
    private ViberKorisnik porukuPrimio;

    private Reakcija reakcijaNaPoruku;

    public Reakcija getReakcijaNaPoruku() {
        return reakcijaNaPoruku;
    }

    public void setReakcijaNaPoruku(Reakcija reakcijaNaPoruku) {
        this.reakcijaNaPoruku = reakcijaNaPoruku;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public ViberKorisnik getPorukuPoslao() {
        return porukuPoslao;
    }

    public ViberKorisnik getPorukuPrimio() {
        return porukuPrimio;
    }

    public ViberPoruka(String tekst, String vreme, ViberKorisnik porukuPoslao, ViberKorisnik porukuPrimio) {
        this.tekst = tekst;
        this.vreme = vreme;
        this.porukuPoslao = porukuPoslao;
        this.porukuPrimio = porukuPrimio;
    }
    public ViberPoruka(){}

    public void stampa(){
        System.out.print("From: " + this.porukuPoslao.getImeIPrezime() + " " );
                this.porukuPoslao.aktivan();
        System.out.print( "-at " + this.vreme);
        System.out.println("To:" + this.porukuPrimio.getImeIPrezime());
        System.out.print(this.tekst + " : " );
        if(this.reakcijaNaPoruku != null ){
            System.out.print(this.reakcijaNaPoruku.getEmoji() +
                    " from " + this.reakcijaNaPoruku.getReagovaoNaPoruku().getImeIPrezime());
        }
    }
}

