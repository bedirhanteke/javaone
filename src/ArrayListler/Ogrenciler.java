package ArrayListler;

public class Ogrenciler {
    private int no;
    private String ad;
    private String sinif;

    public Ogrenciler() {}
    public Ogrenciler(int no, String ad, String sinif){
        this.no = no;
        this.ad = ad;
        this.sinif = sinif;
    }

    public int getNo() { return no;}
    public String getAD() { return ad;}
    public String getSinif(){return sinif;}

    public void Setno(int a){
        this.no = a;
    }
    public void SetAd(String b){
        this.ad = b;
    }
    public void SetSinif(String c){
        this.sinif = c;
    }
}
