package domaci10_01_2023;

public class Knjiga {
    private String isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autorKnjige;
    public Knjiga(){

    }

    public Knjiga(String isbn, String naziv, int godinaIzdanja, Autor autorKnjige) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autorKnjige = autorKnjige;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public Autor getAutorKnjige() {
        return autorKnjige;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public void setAutorKlasa(Autor autorKlasa) {
        this.autorKnjige= autorKlasa;
    }

    // metode
    public void print(){
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Naziv knjige: " + this.naziv + " - " + "Izdata: " + this.godinaIzdanja + ". godine.");
        this.autorKnjige.stampa();
        System.out.println();
    }
}

