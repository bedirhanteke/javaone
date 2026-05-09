package Ödev;
public class Nakit implements OdemeYontemi {
    @Override
    public void odemeYap(double tutar) {
        System.out.println(tutar + " TL nakit olarak vezneye ödendi.");
    }

    @Override
    public void islemDetayi() {
        System.out.println("Ödeme Türü: Fiziksel Nakit");
    }
}