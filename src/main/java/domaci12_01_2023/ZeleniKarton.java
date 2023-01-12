package domaci12_01_2023;

public class ZeleniKarton {
    private String imeIPrezimeStudenta;
    private int brojIndexa;
    private String predmet;
    private String ImeIPrezimeProfesora;
    private int ocena;

    public String getImeIPrezimeStudenta() {
        return imeIPrezimeStudenta;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public String getPredmet() {
        return predmet;
    }

    public String getImeIPrezimeProfesora() {
        return ImeIPrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        ImeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public ZeleniKarton(String imeIPrezimeStudenta, int brojIndexa, String predmet,
                        String imeIPrezimeProfesora, int ocena) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
        this.brojIndexa = brojIndexa;
        this.predmet = predmet;
        ImeIPrezimeProfesora = imeIPrezimeProfesora;
        this.ocena = ocena;
    }
    public ZeleniKarton(){
    }
    public boolean polozenIspit(){
        if (this.ocena > 5){
            return true;
        }else return false;
    }
    public void stampaj(){
        System.out.println(this.predmet + " - " + ocena);
        System.out.println("Student: " + this.imeIPrezimeStudenta + " " + brojIndexa);
        System.out.println("Profesor: " + this.ImeIPrezimeProfesora);
    }
 }


