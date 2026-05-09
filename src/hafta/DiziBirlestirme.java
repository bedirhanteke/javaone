package hafta;

import java.util.Arrays;
import java.util.Scanner;

public class DiziBirlestirme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci dizinin eleman sayısını giriniz");
        int n = scan.nextInt();
        int[] dizi1 = new int[n];
        System.out.println("Birinci dizinin elemanlarını giriniz");
        for (int i = 0; i < n; i++) {
            dizi1[i] = scan.nextInt();
        }

        System.out.println("İkinci dizinin eleman sayısını giriniz");
        int m = scan.nextInt();
        int[] dizi2 = new int[m];
        System.out.println("İkinci dizinin elemanlarını giriniz");
        for (int j = 0; j < m; j++) {
            dizi2[j] = scan.nextInt();
        }

        Arrays.sort(dizi1);
        Arrays.sort(dizi2);

        int[] birlesikDizi = new int[n + m];

        // Merge algoritması
        int i = 0, j = 0, k = 0;

        while(i<n && j<m){
            if(dizi1[i]<=dizi2[j]){
                birlesikDizi[k++]= dizi1[i++];}
            else{
                birlesikDizi[k++]= dizi2[j++];
            }
        }
        //dizi1 den kalanlar 
        while(i<n){
            birlesikDizi[k++]=dizi1[i++];
        }
        while(j<m){
            birlesikDizi[k++]= dizi2[j++];
        }

        System.out.println("Birleşik sıralı dizi: " + Arrays.toString(birlesikDizi));

        scan.close();
    }
}