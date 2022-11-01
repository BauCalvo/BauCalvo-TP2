package EJ12;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sumar(1,2));
        System.out.println(calculadora.resta(1,2));
        System.out.println(calculadora.resta(2,1));
        System.out.println(calculadora.multiplicar(1,2));
        System.out.println(calculadora.dividir(1,2));
        System.out.println(calculadora.dividir(2,1));
        System.out.println(calculadora.dividir(1,0));
        System.out.println(calculadora.dividir(2,0));
        System.out.println(calculadora.dividir(0,1));
        System.out.println(calculadora.dividir(0,2));
    }
}
