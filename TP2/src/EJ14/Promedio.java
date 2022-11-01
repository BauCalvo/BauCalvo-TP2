package EJ14;

public class Promedio {
    Contador contador;
    Acumulador acumulador;

    public Promedio() {
        this.contador = new Contador();
        this.acumulador = new Acumulador();
    }


    public void incrementar(int num){
        contador.incrementarValor();
        acumulador.incrementarValor(num);
    }

    public int obtenerValor(){
        return contador.obtenerValor() == 0  ? 0 : acumulador.obtenerValor() / contador.obtenerValor();
    }


}
