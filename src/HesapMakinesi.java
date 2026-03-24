import java.util.Scanner;

public class HesapMakinesi {
    public static void hesaplayıcı()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Başlangıç sayısını giriniz: ");
        double guncelSonuc = scan.nextDouble();

        while (true) {
            System.out.println("\n--- Mevcut Değer: " + guncelSonuc + " ---");
            System.out.println("[1] Topla (+)  [2] Çıkar (-)  [3] Çarp (*)  [4] Böl (/)  [0] Sıfırla  [s] Çıkış");
            System.out.print("İşlem seçiniz: ");
            
            String secim = scan.next(); // Hem sayı hem harf (s) alabilmek için String

            if (secim.equalsIgnoreCase("s")) {
                System.out.println("Final Sonucu: " + guncelSonuc + "\nHoşça kalın!");
                break;
            }

            if (secim.equals("0")) {
                System.out.print("Yeni başlangıç sayısını giriniz: ");
                guncelSonuc = scan.nextDouble();
                continue; // Döngünün başına dön, alttaki işlemleri atla
            }

            System.out.print("İşlenecek sayı: ");
            double yeniSayi = scan.nextDouble();

            switch (secim) {
                case "1":
                    guncelSonuc += yeniSayi; // guncelSonuc = guncelSonuc + yeniSayi
                    break;
                case "2":
                    guncelSonuc -= yeniSayi;
                    break;
                case "3":
                    guncelSonuc *= yeniSayi;
                    break;
                case "4":
                    if (yeniSayi != 0) {
                        guncelSonuc /= yeniSayi;
                    } else {
                        System.out.println("Hata: 0'a bölünemez! Değer değişmedi.");
                    }
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
        scan.close();
        
    }

}
