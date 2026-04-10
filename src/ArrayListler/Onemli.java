import java.util.ArrayList;
import java.util.Iterator;  


// 1. ADIM: Obje yapımızı kuruyoruz (Öncesi)
class Esya {
    private String isim;

    public Esya(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    @Override
    public String toString() {
        return "Eşya: " + isim;
    }
}

public class Onemli {
    public static void main(String[] args) {
        // 2. ADIM: Listeyi hazırlıyoruz
        ArrayList<Esya> envanter = new ArrayList<>();
        envanter.add(new Esya("Kılıç"));
        envanter.add(new Esya("Kalkan"));
        envanter.add(new Esya("İksir"));

        String silinecekIsim = "Kalkan";
        System.out.println("Silme öncesi envanter: " + envanter);

        // --- KONU: Güvenli Silme (Iterator Kullanımı) ---
        
        // Iterator'ı oluşturuyoruz (Listenin başına bir işaretçi koyar)
        Iterator<Esya> iterator = envanter.iterator();

        while (iterator.hasNext()) { // "Sırada eleman var mı?" diye sorar
            Esya mevcutEsya = iterator.next(); // Sıradaki elemanı eline alır
            
            // Kontrol: Aradığımız eşya bu mu?
            if (mevcutEsya.getIsim().equals(silinecekIsim)) { 
                // ÖNEMLİ: envanter.remove() değil, iterator.remove() diyoruz!
                iterator.remove(); 
                System.out.println(silinecekIsim + " başarıyla silindi.");
            }
        }

        // 3. ADIM: Sonuç (Sonrası)
        System.out.println("Silme sonrası envanter: " + envanter);
    }
}