package hafta;

public class RolllingDice {
    public static void main(String[] args) {
        Die die1, die2;
        die1 = new Die();
        die2 = new Die();   
        int sum; 
        System.out.println(die1);
        System.out.println(die2);

        for(int i = 0; i < 10; i++){
            die1.roll();
            die2.roll();
            sum = die1.getFaceValue() + die2.getFaceValue();
            System.out.println("Die 1: " + die1.getFaceValue() + ", Die 2: " + die2.getFaceValue() + ", Sum: " + sum);
        }

        // Die sınıfının toString metodunu kullanarak zarların durumunu ekrana yazdırabiliriz
        System.out.println(die1);
        System.out.println(die2);   
        // Zarların değerlerini değiştirebiliriz
        die1.setFaceValue(5);
        die2.setFaceValue(3);
        System.out.println(die1);
        System.out.println(die2);   


    }

}
