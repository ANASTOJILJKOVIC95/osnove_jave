package domaci29_12_2022;

public class FacebookPost {
    private String imeIPrezimeKorisnika;
    private String imeIPrezimeKorisnikaPost;
    private String texObjave;
    private int brojLajkova;
    private int brojDeljenja;

    public String getImeIPrezimeKorisnika(){
        return this.imeIPrezimeKorisnika;
    }
    public String getImeIPrezimeKorisnikaPost(){
        return this.imeIPrezimeKorisnikaPost;
    }
    public String gettextObjave(){
        return this.texObjave;
    }
    public int getBrojLajkova(){
        return this.brojLajkova;
    }
    public int getBrojDeljenja(){
        return this.brojDeljenja;
    }
    public void setImeIPrezimeKorisnika(String imeIPrezimeKorisnika){
        this.imeIPrezimeKorisnika=imeIPrezimeKorisnika;
    }
    public void setImeIPrezimeKorisnikaPost(String imeIPrezimeKorisnikaPost){
        this.imeIPrezimeKorisnikaPost = imeIPrezimeKorisnikaPost;
    }
    public void setTexObjave(String texObjave){
        this.texObjave = texObjave;
    }
  public void lajkuj (){
        this.brojLajkova = this.brojLajkova + 1;
  }
    public void dislajk (){
        this.brojLajkova = brojLajkova -1;
        if (this.brojLajkova<0){
            this.brojLajkova = 0;
        }
    }
    public void share (){
        this.brojDeljenja = this.brojDeljenja + 1;
    }
    public void stampaj (){
        System.out.println(this.imeIPrezimeKorisnikaPost + " >>> " + this.imeIPrezimeKorisnika);
        System.out.println(this.texObjave);
        System.out.println("Likes: " +  this.brojLajkova +" | Shares: " + this.brojDeljenja);
    }
}
