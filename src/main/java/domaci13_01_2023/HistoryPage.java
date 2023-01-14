package domaci13_01_2023;

public class HistoryPage {
    private String nazivStranice;
    private String link;
    private int sat;
    private int minut;
    private String userName;
    private String password;

    public String getNazivStranice() {
        return nazivStranice;
    }

    public String getLink() {
        return link;
    }

    public int getSat() {
        return sat;
    }

    public int getMinut() {
        return minut;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setNazivStranice(String nazivStranice) {
        this.nazivStranice = nazivStranice;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public void setMinut(int minut) {
        this.minut = minut;
    }

    public HistoryPage(String nazivStranice, String link, int sat, int minut) {
        this.nazivStranice = nazivStranice;
        this.link = link;
        this.sat = sat;
        this.minut = minut;

    }
    public void HistoryPage(){}

    public void sacuvajKredencijale(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public void obrisiKolacice (){
        this.userName = null;
        this.password = null;
    }
    public void stampa(){
        System.out.print(this.sat + ":" + this.minut + " - " + this.nazivStranice + " - " + this.link);
        if (this.password != null && this.userName != null){
            System.out.print("**");
        }
    }


}
