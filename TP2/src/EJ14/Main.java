package EJ14;

public class Main {
    public static void main(String[] args) {
        Promedio promedio = new Promedio();
        for( int i = 0;i < 20;i++){
            promedio.incrementar((int)(Math.random() * 10+1));
        }
        System.out.println(promedio.obtenerValor());
    }
}
