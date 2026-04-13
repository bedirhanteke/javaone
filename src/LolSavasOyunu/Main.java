package LolSavasOyunu;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner = klavyeden veri almak için kullanılır
        Scanner scan = new Scanner(System.in);

        // Random = rastgele sayı üretmek için kullanılır
        Random rnd = new Random();

        System.out.println("Bir karakter seçiniz:");
        System.out.println("1 - Büyücü");
        System.out.println("2 - Savaşçı");

        // Kullanıcının girdiği sayı secim değişkenine atanır
        int secim = scan.nextInt();

        // nextInt() Enter'ı bellekte bırakır
        // Daha sonra nextLine() kullanacağımız için bunu temizliyoruz
        scan.nextLine();

        /*
         Karakter oyuncu; ne demek?

         Burada oyuncu adında bir referans değişkeni oluşturuyoruz.
         Türü Karakter.

         Yani bu değişken:
         - Buyucu nesnesini de tutabilir
         - Savasci nesnesini de tutabilir

         Çünkü Buyucu ve Savasci, Karakter sınıfından türemiştir.
         Buna polymorphism (çok biçimlilik) denir.
        */
        Karakter oyuncu;

        /*
         switch ile kullanıcının seçimine göre hangi sınıftan nesne üretileceğine karar veriyoruz.

         new Buyucu(...) -> Buyucu sınıfından nesne oluşturur
         new Savasci(...) -> Savasci sınıfından nesne oluşturur

         Parantez içindeki değerler constructor'a gider.
         Yani parametre olarak gönderilir.
        */
        switch (secim) {
            case 1:
                /*
                 Burada Buyucu sınıfından bir nesne oluşturuyoruz.

                 "Ahri"  -> isim parametresi
                 100     -> sağlık parametresi
                 rnd.nextInt(11) + 15 -> saldırı gücü parametresi

                 Yani constructor şuna benzer:
                 Buyucu(String isim, int saglik, int saldiriGucu)
                */
                oyuncu = new Buyucu("Ahri", 100, rnd.nextInt(11) + 15);
                break;

            case 2:
                oyuncu = new Savasci("Garen", 120, rnd.nextInt(11) + 12);
                break;

            default:
                System.out.println("Geçersiz seçim yaptın, varsayılan olarak Garen seçildi.");
                oyuncu = new Savasci("Garen", 120, rnd.nextInt(11) + 12);
                break;
        }

        /*
         Bot için de yine Karakter türünde referans oluşturduk.
         Ama içine bazen Savasci bazen Buyucu nesnesi koyacağız.
        */
        Karakter bot;

        // nextBoolean() true veya false döndürür
        if (rnd.nextBoolean()) {
            bot = new Savasci("Yasuo", 110, rnd.nextInt(11) + 13);
        } else {
            bot = new Buyucu("Ahmet", 95, rnd.nextInt(11) + 14);
        }

        System.out.println("Senin karakterin: " + oyuncu);
        System.out.println("Bilgisayarın karakteri: " + bot);

        // İki karakter de yaşıyorsa oyun devam eder
        while (oyuncu.HayattaMi() && bot.HayattaMi()) {

            System.out.println("\nSaldırmak için Enter'a bas");
            scan.nextLine();

            /*
             oyuncu.Saldir(bot);

             Burada oyuncu referansının türü Karakter olsa da,
             içinde gerçekten Buyucu veya Savasci nesnesi vardır.

             Eğer oyuncu Buyucu ise Buyucu sınıfındaki Saldir() çalışır
             Eğer oyuncu Savasci ise Savasci sınıfındaki Saldir() çalışır

             Bu da polymorphism örneğidir.
            */
            oyuncu.Saldir(bot);

            // Bot ölmediyse karşı saldırı yapar
            if (bot.HayattaMi()) {
                bot.Saldir(oyuncu);
            }

            // Her turdan sonra kalan canları yazdırıyoruz
            System.out.println(oyuncu.getIsim() + " kalan can: " + oyuncu.getSaglik());
            System.out.println(bot.getIsim() + " kalan can: " + bot.getSaglik());
        }

        // Döngü bittiyse biri ölmüştür
        if (oyuncu.HayattaMi()) {
            System.out.println("Tebrikler kazandınız!");
        } else {
            System.out.println("Kaybettin!");
        }

        scan.close();
    }
}