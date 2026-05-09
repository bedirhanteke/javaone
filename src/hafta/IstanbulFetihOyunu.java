package hafta;

import java.util.Scanner;

public class IstanbulFetihOyunu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Başlangıç Değerleri
        int askerSayisi = 10000;
        int moral = 50;
        int kaynak = 50000;
        int surDayanikliligi = 100;

        System.out.println("--- İstanbul'un Fethi Oyununa Hoş Geldiniz! ---");
        System.out.println("Yıl 1453. Genç Sultan Mehmed olarak tarihin akışını değiştirmeye hazır mısınız?");
        
        System.out.print("\nLütfen hükümdar adınızı girin: ");
        String isim = scan.nextLine();
        
        System.out.println("\nSelam olsun Sultan " + isim + "!");
        System.out.println("Durumun: Asker: " + askerSayisi + " | Kaynak: " + kaynak + " | Moral: %" + moral);

        // 1. AŞAMA: Hazırlık
        System.out.println("\n[Soru 1] Büyük Şahi topları döktürmek için 20.000 altın harcamak ister misiniz? (evet/hayir)");
        String secim1 = scan.nextLine().toLowerCase();

        if (secim1.equals("evet")) {
            kaynak -= 20000;
            surDayanikliligi -= 40;
            System.out.println("Muazzam toplar döküldü! Surlar ağır hasar alacak.");
        } else {
            System.out.println("Toplar olmadan surları aşmak çok zor olacak.");
        }

        // 2. AŞAMA: Kuşatma Stratejisi
        System.out.println("\n[Soru 2] Haliç'e zincir çekildi! Gemileri karadan yürütelim mi? (evet/hayir)");
        String secim2 = scan.nextLine().toLowerCase();

        if (secim2.equals("evet")) {
            if (kaynak >= 10000) {
                kaynak -= 10000;
                moral += 30;
                System.out.println("Gemiler karadan yürüdü! Bizans halkı dehşet içinde. Moralimiz yükseldi.");
            } else {
                System.out.println("Yeterli kaynağınız olmadığı için plan başarısız oldu.");
                moral -= 20;
            }
        } else {
            System.out.println("Haliç'e giremedik, kuşatma uzuyor...");
            askerSayisi -= 2000;
        }

        // 3. AŞAMA: Son Saldırı
        System.out.println("\n[Soru 3] Genel taarruz başlatılsın mı? (evet/hayir)");
        String secim3 = scan.nextLine().toLowerCase();

        if (secim3.equals("evet")) {
            System.out.println("\n--- KUŞATMA SONUCU ---");
            
            // Kazanma Koşulu: Surlar zayıflamış ve moral yüksekse
            if (surDayanikliligi <= 60 && moral >= 60) {
                System.out.println("Tebrikler Sultan " + isim + "! İstanbul fethedildi!");
                System.out.println("Bir çağ kapandı, bir çağ açıldı.");
            } else if (askerSayisi > 5000 && surDayanikliligi < 100) {
                System.out.println("Şehir düşmedi ama ağır hasar aldı. Kuşatma devam ediyor...");
            } else {
                System.out.println("Maalesef ordun yorgun düştü ve geri çekilmek zorunda kaldın.");
            }
        } else {
            System.out.println("Taarruz yapılmadı, Bizans zaman kazandı. Oyun bitti.");
        }

        System.out.println("\nKalan Kaynak: " + kaynak + " | Kalan Asker: " + askerSayisi);
        scan.close();
    }
}