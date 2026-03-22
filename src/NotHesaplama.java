import java.util.Scanner;

public class NotHesaplama {
    public static void hesaplama() {
        // Burada adı 'scan' koydun:
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("selam");
        System.out.println("Vize notunuzu giriniz:");

        // HATA BURADAYDI: 'scanner' yerine 'scan' yazmalısın
        int vize_notu = scan.nextInt(); 
        
        System.out.println("Final notunuzu giriniz:");
        
        // HATA BURADAYDI: Yine 'scan' olmalı
        int final_notu = scan.nextInt();

        double ortalama = (vize_notu * 0.4) + (final_notu * 0.6);
        System.out.println("Ortalamanız: " + ortalama);
        
        scan.close();
    }
}