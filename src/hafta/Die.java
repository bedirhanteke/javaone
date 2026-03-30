package hafta;

public class Die {
    private final int MAX = 6;
    private int facevalue;

    public Die() {
        facevalue = 1; // Başlangıç değeri
    }

    public int roll(){
        facevalue = (int)(Math.random() * MAX) + 1;
        return facevalue;
    }

    public void  setFaceValue(int value){
        if(value >= 1 && value <= MAX){
            facevalue = value;
        }
    }
    public int getFaceValue() {
        return facevalue;
    }

    @Override
    public String toString() {     
        return "Die{" +
                "facevalue=" + facevalue +
                '}';
    }

}
