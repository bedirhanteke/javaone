package Eskiler;
public class polymorpihsm {
    public void SesCikar(){
        System.out.println("HAYVAN SES ÇIKARIYOR");
    }


}

class kopek extends polymorpihsm {
    @Override 
    public void SesCikar(){
        {
            System.out.println("Hav Hav!");
        }
    }
}

class Kedi extends polymorpihsm {
    @Override
    public void SesCikar() {
        System.out.println("Miyav!");
    }
}