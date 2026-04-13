package LolSavasOyunu;

/*
 extends Karakter ne demek?

 Buyucu sınıfı, Karakter sınıfının alt sınıfıdır.
 Yani Karakter'in özelliklerini ve metotlarını miras alır.

 Buyucu artık şunlara sahip olur:
 - isim
 - saglik
 - saldiriGucu
 - HayattaMi()
 - hasarAl()
 - toString()   (isterse kendi değiştirir)
*/
public class Buyucu extends Karakter {

    /*
     Buyucu constructor'ı

     Buraya gelen parametreler:
     isim, saglik, saldiriGucu

     Ama bu alanlar aslında üst sınıfta tanımlı.
     O yüzden super(...) ile üst sınıfın constructor'ını çağırıyoruz.
    */
    public Buyucu(String isim, int saglik, int saldiriGucu) {

        /*
         super(isim, saglik, saldiriGucu);

         Bu satır Karakter sınıfının constructor'ını çalıştırır.

         Yani şunu çağırmış olur:
         Karakter(String isim, int saglik, int saldiriGucu)

         Böylece ortak alanlar üst sınıfta doldurulur.
        */
        super(isim, saglik, saldiriGucu);
    }

    /*
     @Override ne demek?

     Üst sınıfta aynı isimde bir metot var demektir.
     Biz burada onu ezip yeni davranış yazıyoruz.

     Karakter sınıfında Saldir() vardı.
     Buyucu burada kendi saldırı stilini yazıyor.
    */
    @Override
    public void Saldir(Karakter rakip) {

        /*
         rakip parametresi = saldırılan karakter

         Bu metoda bir Karakter nesnesi gönderilir.
         Mesela:
         oyuncu.Saldir(bot);

         burada bot, rakip parametresine gider.
        */
        System.out.println(isim + " büyü saldırısı yaptı!");

        // Büyücü normal saldırıya ek +10 bonus hasar veriyor
        rakip.hasarAl(saldiriGucu + 10);
    }

    @Override
    public String toString() {
        return "Büyücü [İsim: " + isim + ", Sağlık: " + saglik + ", Saldırı Gücü: " + saldiriGucu + "]";
    }
}