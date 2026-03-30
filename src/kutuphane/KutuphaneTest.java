package kutuphane;

import java.util.Scanner;

public class KutuphaneTest {
    public static void main(String[] args) {


        kitap ornekKitap = new kitap("Örnek Kitap", "Örnek Yazar", 100, "1234567890");
        System.out.println(ornekKitap);
        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitap Durumunu Değiştir");
            System.out.println("3. Kitap kalın mı ince mi olduğunu kontrol et");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine(); // Boş satırı temizle




            if (secim == 1) {
                System.out.print("Kitap Adı: ");
                String ad = scanner.nextLine();
                System.out.print("Yazar: ");
                String yazar = scanner.nextLine();
                System.out.print("Sayfa Sayısı: ");
                int sayfaSayisi = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("ISBN: ");
                String ISBN = scanner.nextLine();

                kitap yeniKitap = new kitap(ad, yazar, sayfaSayisi, ISBN);
                System.out.println("Kitap eklendi: " + yeniKitap);
    } 
            
            
            else if (secim == 2) {
                System.out.print("Durumunu değiştirmek istediğiniz kitabın ISBN'sini girin: ");
                String ISBN = scanner.nextLine();
                
                if (ornekKitap.getISBN().equals(ISBN)) {
                    boolean yeniDurum = ornekKitap.durumDegistir();
                    System.out.println("Kitabın ödünç verme durumu değişti. Şu an ödünç verildi mi? " + yeniDurum);
                } else {
                    System.out.println("Bu ISBN'ye sahip bir kitap bulunamadı.");
                }
            } 
            
            
            
            else if (secim == 3) {
                System.out.print("Kalınlığını kontrol etmek istediğiniz kitabın ISBN'sini girin: ");
                String ISBN = scanner.nextLine();
              
                if (ornekKitap.getISBN().equals(ISBN)) {
                    if (ornekKitap.getSayfaSayisi() > 100) {
                        System.out.println("Bu kitap kalın.");
                    } else {
                        System.out.println("Bu kitap ince.");
                    }
                } else {
                    System.out.println("Bu ISBN'ye sahip bir kitap bulunamadı.");
                }

            } 


            else if (secim == 4) {
                System.out.println("Çıkış yapılıyor...");
                break;  
            }
            
                
                
            else {
                System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }

        scanner.close();
    }}}


