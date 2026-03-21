public class eksiilebölüm {
    public int eksilibölüm(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Bölen sıfır olamaz.");
        }
        // Bölme işleminin sonucunun işaretini belirleyelim.
        int sign = (dividend <0 && divisor > 0) || (dividend > 0 && divisor < 0) ? -1 : 1;
        
        // Mutlak değerleri alarak bölme işlemini gerçekleştirelim.
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);


        int result = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            result++;
        }

        return sign * result;
    }

}
        
  