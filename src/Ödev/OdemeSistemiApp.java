package Ödev;
import java.util.ArrayList;
import java.util.Scanner;

public class OdemeSistemiApp {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Ortak bir arayüz (OdemeYontemi) tipinde bir liste oluşturuyoruz.
        // Bu sayede KrediKarti, Nakit gibi farklı tipleri aynı kutuda toplayabiliriz.
        ArrayList<OdemeYontemi> odemeYontemleri = new ArrayList<>();

        // KrediKarti ve Nakit sınıflarından kendi nesnelerimizi üretiyoruz.
        KrediKarti kk = new KrediKarti("1234-5678-9012-3456", "Serkan SAVAŞ");
        Nakit nakit = new Nakit();

        // Ürettiğimiz nesneleri ortak listeye ekliyoruz. 
        odemeYontemleri.add(kk);     // Listenin 0. indeksine KrediKarti eklendi
        odemeYontemleri.add(nakit);  // Listenin 1. indeksine Nakit eklendi

        // Listenin boyutu (eleman sayısı) kadar dönecek bir döngü başlatıyoruz.
        for (int i = 0; i < odemeYontemleri.size(); i++) {
            
            // Listenin 'i' sırasındaki elemanını alıp 'yontem' isimli geçici referansa atıyoruz.
            OdemeYontemi yontem = odemeYontemleri.get(i);
            
            System.out.println("--- Ödeme İşlemi Başlatıldı ---");
            
            // POLYMORPHISM (Çok Biçimlilik) BURADA DEVREYE GİRER:
            // Döngünün ilk turunda kredi kartının, ikinci turunda nakit'in detaylarını basar.
            yontem.islemDetayi();
            
            // İndeks sırasına bakarak manuel bir kontrol yapıyoruz.
            if (yontem instanceof KrediKarti) 
            { 
                
                System.out.println("Kredi kartı için ödeme tutarını girin:");
                double tutar = scanner.nextDouble();
                
                System.out.println("Taksit sayısını girin:");
                int taksit = scanner.nextInt();
                
                // Interface'ten miras alınan standart tek çekim ödeme metodu
                yontem.odemeYap(tutar);
                
                // DOWNCASTING (Aşağı Dönüştürme) & OVERLOADING (Aşırı Yükleme):
                // 'yontem' referansını parantez içinde KrediKarti'na dönüştürüyoruz.
                // Böylece sadece KrediKarti sınıfında bulunan "2 parametreli (taksitli)" özel metoda erişebiliyoruz.
                ((KrediKarti) yontem).odemeYap(tutar, taksit);
                
            } else { // 0 değilse (yani 1. indeks ise) Nakit olduğunu biliyoruz
                
                System.out.println("Nakit için ödeme tutarını girin:");
                double tutar = scanner.nextDouble();
                
                // Nakit sınıfı içindeki ezilmiş (Override edilmiş) ödeme metodu çalışır
                yontem.odemeYap(tutar);
            }
        }
        
        scanner.close();
    }
}