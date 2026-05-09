public class KrediKarti implements OdemeYontemi {
    private String kartNo;
    private String kartSahibi;

    public KrediKarti(String kartNo, String kartSahibi) {
        this.kartNo = kartNo;
        this.kartSahibi = kartSahibi;
    }

    @Override
    public void odemeYap(double tutar) {
        System.out.println(tutar + " TL kredi kartı ile tek çekim olarak ödendi.");
    }

    public void odemeYap(double tutar, int taksitSayisi) {
        double aylik = tutar / taksitSayisi;
        System.out.println("[Ekstra] " + tutar + " TL tutarı " + taksitSayisi + " taksit halinde ödendi (Aylık: " + aylik + " TL).");
    }

    @Override
    public void islemDetayi() {
        System.out.println("Ödeme Türü: Kredi Kartı (" + kartSahibi + ")");
    }
}