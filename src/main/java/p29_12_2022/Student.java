package p29_12_2022;

public class Student {
    private String ime;
    private String prezime;
    private  int index;
    private boolean budzet;

    public String getIme (){
        return this.ime;
    }
    public String getPrezime(){
        return this.prezime;
    }
    public int getIndex(){
        return this.index;
    }
    public boolean getBudzet (boolean budzet){
        return this.budzet;
    }
    public void setIme (String ime){
        this.ime = ime;
    }
    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
    public void setIndex (int index){
        this.index =index;
    }
    public void setBudzet(boolean budzet){
        this.budzet= budzet;
    }
}
