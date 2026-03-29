package hafta;

import java.util.Scanner;

public class haftalar2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        haftalar2 program = new haftalar2();

        System.out.println("--- Java Temel Kavramlar Çalışma Notu ---");

         //Test etmek istediğin metodun yorum satırını kaldırabilirsin:
        //program.aritmetikVeHassasiyet();
        //program.zamanVeGunHesaplama();
        program.tipDonusumleri(input);
        //program.operatorOnceligiVeShorthand();
        //program.prefixPostfixFarklari();

        input.close();
    }

    /**
     * 1. Aritmetik İşlemler ve Veri Tipi Hassasiyeti
     */
    public void aritmetikVeHassasiyet() {
        System.out.println("\n--- 1. Aritmetik ve Hassasiyet ---");
        
        System.out.println("Tam Sayı Bölmesi (3.0/2): " + (3.0 / 2)); // 1.5 (Double olduğu için)
        System.out.println("Mod Operatörü (7%3): " + (7 % 3));      // 1 (Kalan)

        // Float vs Double Hassasiyeti
        // Double (varsayılan) 64 bit, Float 32 bittir.
        System.out.println("Double Hassasiyeti (1.0/3.0): " + 1.0 / 3.0);
        System.out.println("Float Hassasiyeti (1.0f/3.0f): " + 1.0f / 3.0f);
    }

    /**
     * 2. Modulo (%) Kullanım Alanları: Gün ve Zaman Hesaplama
     */
    public void zamanVeGunHesaplama() {
        System.out.println("\n--- 2. Zaman ve Gün Hesaplama ---");

        // Gün Hesaplama Logic
        int bugun = 2; // Salı
        int kacGunSonra = 20;
        int hedefGun = (bugun + (kacGunSonra % 7)) % 7; 
        // Not: (bugun + kalan) 7'yi aşarsa tekrar mod almalıyız.
        System.out.println("Salıdan 20 gün sonrası (0:Paz, 1:Pzt...): " + hedefGun);

        // Saniye -> Dakika Dönüşümü
        int toplamSaniye = 125;
        int dakika = toplamSaniye / 60;
        int kalanSaniye = toplamSaniye % 60;
        System.out.println(toplamSaniye + " saniye = " + dakika + " dk " + kalanSaniye + " sn.");
    }

    /**
     * 3. Tip Dönüşümleri (Type Casting)
     * Implicit (Otomatik) ve Explicit (Zorunlu) Dönüşümler
     */
    public void tipDonusumleri(Scanner input) {
        System.out.println("\n--- 3. Tip Dönüşümleri ---");

        // Genişletme (Widening) - Otomatik
        byte kucuk = 110;
        int buyuk = kucuk; 
        System.out.println("Otomatik Dönüşüm (byte -> int): " + buyuk);

        // Daraltma (Narrowing) - Manuel (Veri kaybı riski!)
        int x = 500; 
        byte y = (byte) x; // Byte max 127 alabilir, 500 yazarsak "Overflow" olur.
        System.out.println("Veri Kayıplı Dönüşüm (500 -> byte): " + y); // -12 döndürür (Çevrimsel)

        // Ondalıklıdan Tam Sayıya
        System.out.println("Double -> Int (1.7 -> ?): " + (int) 1.7); // 1 (Yuvarlamaz, kırpar)
    }

    /**
     * 4. Operatör Önceliği ve Shorthand (Bileşik) Atamalar
     */
    public void operatorOnceligiVeShorthand() {
        System.out.println("\n--- 4. Operatör Önceliği ---");

        // Sınavda Çıkabilecek Kritik Örnek
        double a = 6.5;
        a += a + 1; // İşlem sırası: a = a + (a + 1) -> 6.5 + (6.5 + 1)
        System.out.println("a += a + 1 sonucu: " + a); // 14.0

        // Karmaşık Denklem (Parantez her zaman önce gelir)
        // double islem = ((3+4*x)/5)-((10*(y-5)*(a+b+c))/x)+(9*((4/x)+((9+x)/y)));
        System.out.println("Not: Karmaşık işlemlerde parantez hayat kurtarır.");
    }

    /**
     * 5. Prefix (Öncel) ve Postfix (Sonsal) Artırma/Azaltma
     * SINAVDA SORULABİLECEK EN KRİTİK YER
     */
    public void prefixPostfixFarklari() {
        System.out.println("\n--- 5. Prefix vs Postfix ---");

        int i = 10;
        // i++: Önce kullan, sonra artır
        System.out.println("Postfix (i++): " + (10 * i++)); // 10 * 10 = 100 (i sonra 11 olur)
        
        int j = 10;
        // ++j: Önce artır, sonra kullan
        System.out.println("Prefix (++j): " + (10 * ++j));  // 10 * 11 = 110

        // Karmaşık Örnek
        int n = 1;
        int sonuc = ++n + n * 3; // 2 + (2 * 3) = 8
        System.out.println("++n + n * 3 sonucu: " + sonuc);
    }
}