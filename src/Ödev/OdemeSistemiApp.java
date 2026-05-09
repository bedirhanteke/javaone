package Ödev;
import java.util.ArrayList;

public class OdemeSistemiApp {
    public static void main(String[] args) {
        ArrayList<OdemeYontemi> odemeYontemleri = new ArrayList<>();

        KrediKarti kk = new KrediKarti("1234-5678-9012-3456", "Serkan SAVAŞ");
        Nakit nakit = new Nakit();

        odemeYontemleri.add(kk);
        odemeYontemleri.add(nakit);

        for (int i = 0; i < odemeYontemleri.size(); i++) {
            OdemeYontemi yontem = odemeYontemleri.get(i);
            System.out.println("--- Ödeme İşlemi Başlatıldı ---");
            yontem.islemDetayi();
            if (i == 0) { // KrediKarti için
                yontem.odemeYap(1500.0);
                ((KrediKarti) yontem).odemeYap(1500.0, 3);
            } else { // Nakit için
                yontem.odemeYap(500.0);
            }
        }
    }
}