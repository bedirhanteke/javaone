package LolSavasOyunu;

/*
 Savasci da Karakter sınıfından türemiştir.
 Yani o da bir Karakter'dir.
*/
public class Savasci extends Karakter {

    /*
     Constructor parametreleri:
     isim
     saglik
     saldiriGucu

     Bunları super ile üst sınıfa gönderiyoruz.
    */
    public Savasci(String isim, int saglik, int saldiriGucu) {
        super(isim, saglik, saldiriGucu);
    }

    @Override
    public void Saldir(Karakter rakip) {
        System.out.println(isim + " Dönen Garen saldırısı yaptı!");

        // Savaşçı direkt kendi saldırı gücü kadar hasar verir
        rakip.hasarAl(saldiriGucu);
    }

    @Override
    public String toString() {
        return "Savaşçı [İsim: " + isim + ", Sağlık: " + saglik + ", Saldırı Gücü: " + saldiriGucu + "]";
    }
}