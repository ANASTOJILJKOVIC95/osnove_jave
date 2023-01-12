package p11_01_2023;

public class FizickoLice {
    private String imeIPrezime;
    private String brojLK;
    private String jmbg;
    private boolean vecKupovao;

    public FizickoLice(String imeIPrezime, String brojLK, String jmbg, boolean vecKupovao) {
        this.imeIPrezime = imeIPrezime;
        this.brojLK = brojLK;
        this.jmbg = jmbg;
        this.vecKupovao = vecKupovao;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojLK() {
        return brojLK;
    }

    public void setBrojLK(String brojLK) {
        this.brojLK = brojLK;
    }

    public boolean getVecKupovao() {
        return vecKupovao;
    }

    public void setVecKupovao(boolean vecKupovao) {
        this.vecKupovao = vecKupovao;
    }

    public void stampaj(){
        System.out.print(imeIPrezime + ", broj licne karte: " + brojLK );
    }
}
