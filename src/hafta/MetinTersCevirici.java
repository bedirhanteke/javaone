package hafta;

import java.util.Scanner;

public class MetinTersCevirici {
    public static void Tersevir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizi elemanlarını giriniz (boşlukla ayrılmış): ");
        String input = scan.nextLine();
        
        // Stringi parse edip integer array'ine çevir
        String[] parcalar = input.split(" ");
        int[] sayiDizi = new int[parcalar.length];
        
        for (int i = 0; i < parcalar.length; i++) {
            sayiDizi[i] = Integer.parseInt(parcalar[i]);
        }
        
        // Ters sırası ile yazdır
        System.out.print("Tersten: ");
        for (int i = sayiDizi.length - 1; i >= 0; i--) {
            System.out.print(sayiDizi[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();

        scan.close();

    }
    


}
