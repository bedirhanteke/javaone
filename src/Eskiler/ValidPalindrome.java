package Eskiler;
public class ValidPalindrome {
    
    public boolean isPalindrome(String s) {
        // 1. Durum: Eğer metin boşsa (""), kural gereği palindrom sayılır.
        if (s.isEmpty()) return true;

        // İki uçtan merkeze doğru gelecek işaretçileri (pointer) tanımlıyoruz.
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        // İşaretçiler birbirini geçene kadar döngü devam eder.
        while (leftPointer <= rightPointer) {
            // O anki konumdaki karakterleri değişkenlere atıyoruz.
            char currentLeftChar = s.charAt(leftPointer);
            char currentRightChar = s.charAt(rightPointer);

            // --- SÜZGEÇ (IF-ELSE) YAPISI ---
            
            // Eğer soldaki karakter harf veya rakam DEĞİLSE (boşluk, virgül vb.):
            if (!Character.isLetterOrDigit(currentLeftChar)) {
                leftPointer++; // Sadece soldakini bir sağa kaydır, bu turu bitir.
            } 
            // Eğer sol temiz ama SAĞDAKİ karakter harf veya rakam DEĞİLSE:
            else if (!Character.isLetterOrDigit(currentRightChar)) {
                rightPointer--; // Sadece sağdakini bir sola kaydır, bu turu bitir.
            } 
            // Eğer HER İKİSİ DE geçerli bir harf veya rakamsa:
            else {
                // Karakterleri küçük harfe çevirip kıyaslıyoruz (A ile a aynı sayılmalı).
                if (Character.toLowerCase(currentLeftChar) != Character.toLowerCase(currentRightChar)) {
                    return false; // Eşit değillerse palindrom değildir, direkt çık.
                }
                // Karakterler eşitse, her iki tarafı da merkeze bir adım yaklaştır.
                leftPointer++;
                rightPointer--;
            }
        }
        // Döngü sonuna kadar hata çıkmadıysa bu bir palindromdur.
        return true;
    }
}