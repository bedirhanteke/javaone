// ================= PARENT CLASS =================
class Hayvan {

    // Parent class'ın bildiği tek metod
    public void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor");
    }
}


// ================= CHILD CLASS =================
class Kedi extends Hayvan {

    // OVERRIDE:
    // Parent'taki sesCikar() metodunu ezdik
    @Override
    public void sesCikar() {
        System.out.println("Miyav");
    }

    // OVERLOAD:
    // Sadece child class'a özel yeni bir metod ekledik
    // Parent bunu bilmiyor
    public void sesCikar(int kez) {
        for(int i = 0; i < kez; i++) {
            System.out.println("Miyav");
        }
    }
}


// ================= MAIN =================
public class Main {
    public static void main(String[] args) {

        // Upcasting:
        // Gerçek nesne Kedi ama referans tipi Hayvan
        Hayvan h = new Kedi();


        // ------------------------------------------------
        // 1) OVERRIDE EDİLEN METOD
        // Parent'te tanımlı olduğu için direkt çağrılabilir
        // Java önce Hayvan'a bakar -> metod var
        // sonra runtime'da gider Kedi'nin metodunu çalıştırır
        // (Polymorphism)
        // ------------------------------------------------
        h.sesCikar();

        // çıktı:
        // Miyav



        // ------------------------------------------------
        // 2) CHILD'A ÖZEL OVERLOAD METOD
        // Parent class (Hayvan) bunu bilmiyor:
        //
        // h.sesCikar(3);
        //
        // HATA verir:
        // "cannot find symbol"
        //
        // Çünkü Java referans tipine bakıyor:
        // Hayvan içinde sesCikar(int) YOK
        // ------------------------------------------------



        // ------------------------------------------------
        // 3) DOWNCASTING
        // "Ben biliyorum bu aslında Kedi" diyoruz
        // Böylece child class metodlarına erişiyoruz
        // ------------------------------------------------
        ((Kedi) h).sesCikar(3);

        // çıktı:
        // Miyav
        // Miyav
        // Miyav



        // ------------------------------------------------
        // ÖZET
        // ------------------------------------------------
        //
        // h.sesCikar();           -> cast gerekmez (override)
        //
        // ((Kedi)h).sesCikar(3); -> cast gerekir (child'a özel)
        //
    }
}