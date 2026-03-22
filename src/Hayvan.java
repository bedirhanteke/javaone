// Üst Sınıf (Super Class / Parent)
public class Hayvan { // 'class public' değil, 'public class' olmalı
    String isim;
    int yas;

    public void yemekYe() {
        System.out.println(isim + " yemek yiyor...");
    }
}

// Alt Sınıf (Sub Class / Child)
class Kopek extends Hayvan {
    // Hayvan sınıfındaki 'isim', 'yas' ve 'yemekYe' otomatik olarak buraya geldi!
    
    public void havla() {
        System.out.println(isim + " havlıyor: Hav Hav!");
    }
}