public class eksiilebölüm {
    public int eksilibölüm(int dividend, int divisor) {
         // 1. ÖZEL DURUM (OVERFLOW) KONTROLLERİ
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.   MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        if (dividend == divisor) return 1;
        if (divisor == 1) return dividend; 
        if (divisor == -1) return -dividend;

        // 2. İŞARET BELİRLEME
        int sign = (dividend < 0 ^ divisor < 0) ? -1 : 1;

        // 3. HESAPLAMA (Long kullanarak taşmayı önlüyoruz)
        long lDividend = Math.abs((long) dividend);
        long lDivisor = Math.abs((long) divisor);
        int result = 0;

        // 4. BITWISE İLE HIZLI BÖLME (Katlayarak Çıkarma)
        while (lDividend >= lDivisor) {
            long tempDivisor = lDivisor;
            long count = 1;
            
            // Böleni her adımda 2 katına çıkar (Sola kaydırma <<)
            while (lDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                count <<= 1;
            }
            
            lDividend -= tempDivisor;
            result += count;
        }

        return sign * result;
    }

}
        
  