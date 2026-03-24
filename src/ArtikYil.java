// Senin kodunun temizlenmiş ve test edilmiş hali:
public class ArtikYil {
    public void ArtikYilHesapla(int yil) {
        if ((yil % 4000) != 0) {
            if ((yil % 100) == 0) {
                if ((yil % 400) == 0) {
                    System.out.println(yil + " yılı artık bir yıldır");
                } else {
                    System.out.println(yil + " yılı artık yıl değildir");
                }
            } else if ((yil % 4) == 0) {
                System.out.println(yil + " yılı artık bir yıldır");
            } else {
                System.out.println(yil + " yılı artık yıl değildir");
            }
        } else {
            System.out.println(yil + " yılı artık yıl değildir (4000 kuralı)");
        }
    }
}