package hafta;

import java.util.Scanner;

public class haftalar2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        haftalar2 program = new haftalar2();

        System.out.println("--- Java Temel Kavramlar Çalışma Notu ---");
        
        program.aritmetikVeHassasiyet();

        input.close();

    }
    
    public void aritmetikVeHassasiyet(){
        System.out.println(" 1. aritmatik hassasiyet");
        System.out.println("tam sayı bölmesi (3.0/2):" + (3.0/2)); //1.5 double olduğu için 
        System.out.println("mod operatörü (7%3"+ (7%3)); // 1 kalan
        
        // float vs double
        System.out.println("Double Hassasiyeti (1.0/3.0): " + 1.0 / 3.0);
        System.out.println("Float Hassasiyeti (1.0f/3.0f): " + 1.0f / 3.0f);



    }




}
