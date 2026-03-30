package hafta;

public class hafta5 {
    public static void main(String[] args) {
        // sum metodunu çağırarak 5'e kadar olan sayıların toplamını ekrana yazdırıyoruz
        System.out.println(sum(5));
        int a = sum(22);
        System.out.println(a);



        // Değişkenlerin değerlerinin değişmediğini görebiliriz
        int x = 1;  
        int y = 2;
        System.out.println("x: " + x + ", y: " + y);
        change(x, y);
        System.out.println("x: " + x + ", y: " + y);    
    }   

    public static int sum(int n){// 1'den n'e kadar olan sayıların toplamını hesaplayan metod
        int result = 0;
        int i = 1;
        while(i <= n){
            result += i;
            i++;    
        }
        return result;
    }

    public static void change(int a, int b){// a ve b'nin değerlerini değiştirmeye çalışan metod
        System.out.println("x: " + a + ", y: " + b);
        a = 3;
        b = 2;
        System.out.println("x: " + a + ", y: " + b);
    }

    // Classes ve Objects (Sınıflar ve Nesneler) konusuna giriş yapacağız
    // Sınıf (Class) nedir? Nesne (Object) nedir?
    // Sınıf, bir nesnenin özelliklerini ve davranışlarını tanımlayan
    // bir şablondur. Nesne ise bu sınıfın bir örneğidir. Sınıf, bir tür veri yapısıdır ve nesneler bu veri yapısının örnekleridir.
    



}
