package EJ6;

public class Dado {
    private int valor;

    public Dado() {
        this.valor = (int)(Math.random() * 6+1);
    }

    public int getValor() {
        return valor;
    }

    public void setValor() {
        this.valor = (int)(Math.random() * 6+1);
    }
}
