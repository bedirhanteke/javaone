package ArrayListler;

import java.util.ArrayList;
import java.util.Iterator; // Iterator kullanabilmek için gerekli kütüphane
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Scanner scanner = new Scanner(System.in);
        
        // // --- 1. ARRAYLIST TANIMLAMA ---
        
        // // Sadece Double türünde veri kabul eden güvenli (Generic) bir liste
        // ArrayList<Double> ortalamalar = new ArrayList<Double>();
        
        // // 'Object' türü sayesinde içine her türlü veriyi (String, int, double vb.) alabilen karma liste
        // ArrayList<Object> karmaListe = new ArrayList<>();

        // // --- 2. ELEMAN EKLEME (add) ---
        
        // karmaListe.add("Merhaba"); // String ekleme
        // karmaListe.add(0.2);       // Double ekleme
        // karmaListe.add(2);         // Integer ekleme
        
        // ortalamalar.add(0.45);
        // ortalamalar.add(0.09);
        // ortalamalar.add(0.22);
        // ortalamalar.add(0.31);
        
        // // --- 3. LİSTE YAZDIRMA YÖNTEMLERİ ---

        // // Yöntem 1: Doğrudan yazdırma (toString metodu arka planda çalışır)
        // System.out.println("1. Doğrudan yazdırma:");
        // System.out.println("Ortalama değerler listesi: " + ortalamalar);

        // // Yöntem 2: Klasik 'for' döngüsü (İndeks tabanlı erişim)
        // // ArrayList'te boyut 'size()' ile, dizilerde ise 'length' ile alınır.
        // System.out.println("\n2. Klasik for döngüsü ile yazdırma:");
        // for (int i = 0; i < ortalamalar.size(); i++) {
        //     // get(i) belirtilen indeksteki elemanı getirir
        //     System.out.println("İndeks " + i + ": " + ortalamalar.get(i));
        // }

        // // Yöntem 3: forEach() metodu ve Lambda kullanımı
        // // Java 8 ile gelen bu yapı daha kısa ve modern bir yazımdır.
        // System.out.println("\n3. forEach() ve Lambda ile yazdırma:");
        // ortalamalar.forEach((deger) -> {
        //     System.out.println("Değer: " + deger);
        // });

        // // Yöntem 4: Gelişmiş For (Enhanced For / For-each)
        // // Listedeki her bir elemanı geçici bir 'd' değişkenine atayarak döner.
        // System.out.println("\n4. For-each (referans) döngüsü ile yazdırma:");
        // for (double d : ortalamalar) {
        //     System.out.println("Eleman: " + d);
        // }
        
        // // --- 4. TEMEL LİSTE METOTLARI ---

        // // get(index): Belirli bir sıradaki elemana ulaşma
        // System.out.println("\nİndeks 2'deki eleman: " + ortalamalar.get(2));

        // // remove(index): Belirtilen indeksteki elemanı listeden siler
        // ortalamalar.remove(1); // 1. indeksteki elemanı siler, sağdakiler sola kayar

        // // contains(deger): Liste içinde bu değer var mı? (boolean döner)
        // if (ortalamalar.contains(0.45)) {
        //     System.out.println("Kontrol: 0.45 listede mevcut.");
        // } else {
        //     System.out.println("Kontrol: 0.45 listede bulunamadı.");
        // }

        // // --- 5. ITERATOR VE WHILE DÖNGÜSÜ KULLANIMI ---
        
        // System.out.println("\n5. Iterator yapısı ile yazdırma:");
        // ArrayList<Object> yeniListe = new ArrayList<>();
        // yeniListe.add("Java");
        // yeniListe.add(10.5);
        // yeniListe.add("Kodlama");

        // // Listeyi taramak için bir 'işaretçi' (Iterator) oluşturuyoruz
        // Iterator<Object> it = yeniListe.iterator();

        // // hasNext(): "Sırada eleman var mı?" diye sorar (true/false)
        // while (it.hasNext()) {
        //     // next(): Bir sonraki elemana geçer ve geçtiği elemanı döndürür
        //     Object eleman = it.next();
        //     System.out.println("Iterator verisi: " + eleman);
        // }
   
        // // --- EKSİK KONU 1: GÜNCELLEME (set) ---
        // // 2. indeksteki 0.22 değerini 0.88 ile değiştiriyoruz
        // ortalamalar.set(2, 0.88);
        // System.out.println("Güncelleme sonrası: " + ortalamalar);

        // // --- EKSİK KONU 2: SIRALAMA (Collections.sort) ---
        // // Listeyi küçükten büyüğe dizer
        // Collections.sort(ortalamalar);
        // System.out.println("Sıralama sonrası: " + ortalamalar);

        // // --- EKSİK KONU 3: ARAMA (indexOf) ---
        // // Bir elemanın kaçıncı sırada olduğunu bulur
        // int sira = ortalamalar.indexOf(0.88);
        // System.out.println("0.88 değeri şu indekste: " + sira);

        // // --- EKSİK KONU 4: BOYUT VE TEMİZLİK ---
        // System.out.println("Listenin boyutu: " + ortalamalar.size());
        
        // // contains ile kontrol edip silme (Örnek)
        // if(ortalamalar.contains(0.09)) {
        //     ortalamalar.remove(0.09); // Değere göre silme
        // }

        // System.out.println("Son durum: " + ortalamalar);
        
        // // Her şeyi silmek istersen:
        // // ortalamalar.clear();










        Scanner scanner = new Scanner(System.in);
        ArrayList<Esya> envanter = new ArrayList<>();
        envanter.add(new Esya("Masa", 10.5, 20.0));
        envanter.add(new Esya("Sandalye", 5.0, 4.0));
        envanter.add(new Esya("Sandalye", 5.0, 4.0)); // İki tane sandalye ekleyelim (Test için)
        envanter.add(new Esya("Lamba", 1.2, 0.5));


        System.out.print("Silmek istediğiniz eşyanın ismini giriniz: ");
        String silinecekIsim = scanner.nextLine();

        // --- HATALI YÖNTEM 1: foreach döngüsü ---
        /*
        for (Esya e : envanter) {
            if (e.getIsim().equals(silinecekIsim)) {
                envanter.remove(e); // HATA! ConcurrentModificationException fırlatır.
            }
        }
        */

        // --- HATALI YÖNTEM 2: Klasik for döngüsü ---
        /*
        for (int i = 0; i < envanter.size(); i++) {
            if (envanter.get(i).getIsim().equals(silinecekIsim)) {
                envanter.remove(i); 
                // HATA! Bir eleman silinince liste sola kayar, i artınca bir sonraki eleman ATLANIR.
            }
        }
        */

        // --- DOĞRU YÖNTEM: Iterator Kullanımı ---
        Iterator<Esya> iterator = envanter.iterator();

        while (iterator.hasNext()) {
            Esya mevcutEsya = iterator.next();
            
            // Senin yazdığın equals metodunu kullanıyoruz (İsim bazlı karşılaştırma)
            // Kullanıcıdan aldığımız isimle bir "hayali" eşya oluşturup karşılaştırabiliriz
            // Veya doğrudan isim kontrolü yapabiliriz.
            if (mevcutEsya.getIsim().equals(silinecekIsim)) { 
                iterator.remove(); // Güvenli silme: Listenin yapısını bozmaz.
            }
        }

        // Alternatif (Modern Java): envanter.removeIf(e -> e.toString().contains(silinecekIsim));

        System.out.println("Güncel Envanter:" + envanter);
        scanner.close();


    } // main sonu
} // class sonu