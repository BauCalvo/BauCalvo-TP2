package EJ6;

public class Test {
    public static void main(String[] args) {
        float promedio1 = 0 ,promedio2 = 0;
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        System.out.println(resultado(dado1,dado2));
        for (int i = 0;i < 100;i++){
            promedio2 = promedio2 + dado2.getValor();
            promedio1 = promedio1 + dado1.getValor();
            dado2.setValor();
            dado1.setValor();
        }
        System.out.println("el promedio del primer dado es: "+promedio1/100+" el promedio del segundo dado es: "+promedio2/100);


    }
    public static String resultado(Dado dado1,Dado dado2){
        if (dado1.getValor() > dado2.getValor()){
            return "el valor mayor entre los 2 dados es "+ dado1.getValor();
        }
        else if (dado2.getValor()>dado1.getValor()) {
            return "el valor mayor entre los 2 dados es "+ dado2.getValor();
        }
        else{
            return "el valor de ambos dados es "+dado1.getValor();
        }
    }
}
