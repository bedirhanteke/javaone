public class Main {
    public static void main(String[] args) {
        // Ogrenci sınıfından bir nesne oluşturuyoruz
        Ogrenci ogr = new Ogrenci();
        ogr.ad = "Bedirhan";
        ogr.numara = 233255002; // Senin numaranı ekledim :)

        // Metodu çağırıyoruz
        ogr.bilgileriGoster();

        NotHesaplama.hesaplama();
    }
}