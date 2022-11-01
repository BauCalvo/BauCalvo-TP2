package EJ11;

public class Main {
    public static void main(String[] args) {
        Turnera turnera = new Turnera();
        System.out.println(turnera);
        turnera.otorgarProximoNumero();
        System.out.println(turnera);
        System.out.println(turnera.obtenerUltimoNumeroOtorgado());
        turnera.resetearContador();
        System.out.println(turnera);
        turnera.resetearContador(69);
        System.out.println(turnera);
    }
}
