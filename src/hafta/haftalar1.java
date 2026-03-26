package hafta;
import java.util.Scanner;

public class haftalar1 {
    public static void main(String[] args) {
        // Scanner'ı burada bir kez açıyoruz
        Scanner input = new Scanner(System.in);

        // Non-static hafta1 metodunu çağırmak için önce nesne oluşturuyoruz
        haftalar1 nesne = new haftalar1();

        // Nesne üzerinden çağırma (Scanner'ı parametre gönderiyoruz)
        double alan1 = nesne.Hafta1(input);
        System.out.println("Daire alanı (Nesne): " + alan1);

        // Static metod üzerinden çağırma
        double alan2 = haftalar1.hafta1(input);
        System.out.println("Daire alanı (Static): " + alan2);

        // Program tamamen biterken kapatıyoruz
        input.close();
    }

    // Parametre olarak Scanner alan non-static metod
    public double Hafta1(Scanner input){
        System.out.print("lütfen yarı çap giriniz: ");
        double yaricap = input.nextDouble();
        return 2 * Math.PI * yaricap; 
        
    }

    // Parametre olarak Scanner alan static metod
    public static double hafta1(Scanner input){
        System.out.print("lütfen yarı çap giriniz (static): ");
        double yaricap = input.nextDouble();
        return 2 * Math.PI * yaricap;
    
    }
}