package kutuphane;

public class kitap {
    private String ad;
    private String yazar;
    int sayfaSayisi;
    private String ISBN;
    public boolean oduncVerildiMi;

    public kitap(String ad, String yazar, int sayfaSayisi, String ISBN) {
        this.ad = ad;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
        this.ISBN = ISBN;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean durumDegistir(){
        if(oduncVerildiMi){
            oduncVerildiMi = false;
            return false;
        } else {
            oduncVerildiMi = true;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Kitap [ad=" + ad + ", yazar=" + yazar + ", sayfaSayisi=" + sayfaSayisi + ", ISBN=" + ISBN + ", oduncVerildiMi=" + oduncVerildiMi + "]";
    }

}
