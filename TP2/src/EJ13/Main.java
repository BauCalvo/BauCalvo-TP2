package EJ13;

public class Main {
    public static void main(String[] args) {
        SuperHeroe superHeroe1 = new SuperHeroe("Batman",90,70,0);
        System.out.println(superHeroe1.competir(new SuperHeroe("Superman",95,60,70)));
        System.out.println(superHeroe1.competir(new SuperHeroe("Aquaman",30,20,0)));
        System.out.println(superHeroe1.competir(new SuperHeroe("Robin",70,75,0)));
    }
}
