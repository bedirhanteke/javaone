package kutuphane;

import java.util.ArrayList;
import java.util.Scanner;

public class KutuphaneTest {
    public static void main(String[] args) {

        int sayac = 0;
        ArrayList<kitap> kitapListesi = new ArrayList<>();
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
                boolean devamEt = true;
                while (devamEt) {
                    System.out.print("Kitap Adı: ");
                    String ad = scanner.nextLine();
                    System.out.print("Yazar: ");
                    String yazar = scanner.nextLine();
                    System.out.print("Sayfa Sayısı: ");
                    int sayfaSayisi = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("ISBN: ");
                    String ISBN = scanner.nextLine();
                    //arraylist'e yeni kitap eklemece
                    kitap örnekKitap = new kitap(ad, yazar, sayfaSayisi, ISBN);
                    kitapListesi.add(örnekKitap);
                    System.out.println("Kitap eklendi: " + örnekKitap);
                    sayac++;
                    
                    if (sayac >= 5) {
                        System.out.println("Minimum kitap sayısına ulaşıldı. Kitap eklemek ister misiniz? (Evet/Hayır)");
                        String cevap = scanner.nextLine();
                        if (cevap.equalsIgnoreCase("Hayır")) {  
                            devamEt = false;
                        }
                    }
                }
            } 
            
            
            else if (secim == 2) {
                System.out.print("Durumunu değiştirmek istediğiniz kitabın ISBN'sini girin: ");
                String ISBN = scanner.nextLine();
                boolean bulundu = false;
                
                for (kitap k : kitapListesi) {
                    if (k.getISBN().equals(ISBN)) {
                        boolean yeniDurum = k.durumDegistir();
                        System.out.println("Kitabın ödünç verme durumu değişti. Şu an ödünç verildi mi? " + yeniDurum);
                        bulundu = true;
                        break;
                    }
                }
                
                if (!bulundu) {
                    System.out.println("Bu ISBN'ye sahip bir kitap bulunamadı.");
                }
            } 
            
            
            
            else if (secim == 3) {
                System.out.print("Kalınlığını kontrol etmek istediğiniz kitabın ISBN'sini girin: ");
                String ISBN = scanner.nextLine();
                boolean bulundu = false;
              
                for (kitap k : kitapListesi) {
                    if (k.getISBN().equals(ISBN)) {
                        if (k.getSayfaSayisi() > 300) {
                            System.out.println("Bu kitap kalın.");
                        } else {
                            System.out.println("Bu kitap ince.");
                        }
                        bulundu = true;
                        break;
                    }
                }
                
                if (!bulundu) {
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
        }
        
        scanner.close();
    }
}

