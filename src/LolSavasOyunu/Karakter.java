package LolSavasOyunu;

public class Karakter {

    /*
     protected ne demek?

     Bu değişkenlere:
     - aynı sınıf içinden erişilebilir
     - alt sınıflardan erişilebilir

     Yani Buyucu ve Savasci bu alanları kullanabilir.
    */
    protected String isim;
    protected int saglik;
    protected int saldiriGucu;

    /*
     Constructor (yapıcı metot)

     Nesne oluşturulurken ilk çalışan yapıdır.
     new Karakter("Ahri", 100, 20) yazarsan burası çalışır.

     Parametreler:
     String isim       -> dışarıdan gelen isim değeri
     int saglik        -> dışarıdan gelen sağlık değeri
     int saldiriGucu   -> dışarıdan gelen saldırı gücü
    */
    public Karakter(String isim, int saglik, int saldiriGucu) {

        /*
         this.isim = isim; ne demek?

         Soldaki this.isim -> sınıfın özelliği
         Sağdaki isim      -> metoda gelen parametre

         Yani dışarıdan gelen değeri nesnenin içine kaydediyoruz.
        */
        this.isim = isim;
        this.saglik = saglik;
        this.saldiriGucu = saldiriGucu;
    }

    /*
     Bu metod alt sınıflarda değiştirilsin diye yazıldı.
     Yani Buyucu ve Savasci kendi saldırı şeklini burada özelleştirecek.
    */
    public void Saldir(Karakter rakip) {
        System.out.println(isim + " saldırdı.");
        rakip.hasarAl(saldiriGucu);
    }

    // Karakterin canı 0'dan büyükse yaşıyordur
    public boolean HayattaMi() {
        return saglik > 0;
    }

    /*
     hasarAl(int hasar)

     Parametre olarak hasar miktarı gelir.
     Mesela hasarAl(20) dersek, karakter 20 hasar alır.
    */
    public void hasarAl(int hasar) {
        saglik -= hasar;

        if (saglik < 0) {
            saglik = 0;
        }

        System.out.println(isim + " " + hasar + " hasar aldı. Kalan can: " + saglik);
    }

    // Getter metot: saglik değerini dışarıya verir
    public int getSaglik() {
        return saglik;
    }

    // Getter metot: isim değerini dışarıya verir
    public String getIsim() {
        return isim;
    }

    @Override
    public String toString() {
        return "Karakter [isim=" + isim + ", saglik=" + saglik + ", saldiriGucu=" + saldiriGucu + "]";
    }
}