package domaci10_01_2023;

public class Video {
    private String id;
    private String nazivVidea;
    private int duzinaVidea;
    private int brojLajkova;
    private int brojDislajkova;
    private int brojPregleda;

    public void lajkuj() {
        this.brojLajkova++;
    }
     public void dislajkuj(){
        this.brojDislajkova++;
     }
     public void pogledaj(){
        this.brojPregleda++;
     }

    public String getId() {
        return id;
    }

    public String getNazivVidea() {
        return nazivVidea;
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public int getBrojLajkova() {
        return brojLajkova;
    }

    public int getBrojDislajkova() {
        return brojDislajkova;
    }

    public int getBrojPregleda() {
        return brojPregleda;
    }

    public Video(String id, String nazivVidea, int duzinaVidea,
                 int brojLajkova, int brojDislajkova, int brojPregleda) {
        this.id = id;
        this.nazivVidea = nazivVidea;
        this.duzinaVidea = duzinaVidea;
        this.brojLajkova = brojLajkova;
        this.brojDislajkova = brojDislajkova;
        this.brojPregleda = brojPregleda;
    }
}
