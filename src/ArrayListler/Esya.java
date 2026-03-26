package ArrayListler;

public class Esya {
    private String isim;
    private double hacim;
    private double kilo;

    public Esya(String isim, double hacim, double kilo)
    {
        this.isim = isim;
        this.hacim = hacim;
        this.kilo = kilo;
    }

    public String getIsim() {
        return isim;
    }

    public double getHacim() {
        return hacim;
    }

    public double getKilo() {
        return kilo;
    }   

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false; // Null veya farklı sınıf ise eşit değil
        return this.isim.equals(((Esya) obj).isim); // İsimler eşitse eşit kabul edilir

    }


    public String toString(){
        return "\n" + isim + " + " + kilo + " + " + hacim;
    }
}
