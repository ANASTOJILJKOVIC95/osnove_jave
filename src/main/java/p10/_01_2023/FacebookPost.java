package p10._01_2023;

public class FacebookPost {
    private String opis;
    private Korisnik napisaoPost;

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public FacebookPost(String opis) {
        this.opis = opis;
    }
     public void napisaoPost(Korisnik napisaoPost){
        this.napisaoPost = napisaoPost;
     }

     public void stampa (){
         System.out.println(this.napisaoPost.getIme() + " " + this.napisaoPost.getPrezime());
         System.out.println(this.opis);
     }

}
