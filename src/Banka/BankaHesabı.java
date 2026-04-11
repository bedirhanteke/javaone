package Banka;

public class BankaHesabı {
    private String hesapNumarası;
    private double bakiye;

    public BankaHesabı(String hesapNumarası, double bakiye) {
        this.hesapNumarası = hesapNumarası;
        this.bakiye = bakiye;
    }

    public String getHesapNumarası() {
        return hesapNumarası;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void paraYatır(double miktar) {
        if (miktar > 0) {
            bakiye += miktar;
            System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye + " TL");
        } else {
            System.out.println("Geçersiz miktar. Lütfen pozitif bir değer girin.");
        }
    }

    public void paraÇek(double miktar) {
        if (miktar > 0 && miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Yeni bakiye: " + bakiye + " TL");
        } else {
            System.out.println("Yetersiz bakiye veya geçersiz miktar.");
        }
    }
   
}
