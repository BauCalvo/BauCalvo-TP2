package EJ14;

public class Acumulador {
    private int acumulador;

    public Acumulador() {
        this.acumulador = 0;
    }

    public int obtenerValor() {
        return acumulador;
    }

    public void incrementarValor(int acumulador) {
        this.acumulador += acumulador;
    }
}
