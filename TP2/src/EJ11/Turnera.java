package EJ11;

public class Turnera {
    private int turno;

    public Turnera() {
        this.turno = 0;
    }

    public void otorgarProximoNumero(){
        this.turno ++;
        System.out.println("el proximo turno es el: "+turno);
    }
    public int obtenerUltimoNumeroOtorgado(){
        return this.turno;
    }
    public void resetearContador(){
        this.turno = 0;
    }
    public void resetearContador(int posicion){
        this.turno = posicion>=0 ? posicion : this.turno;
    }

    @Override
    public String toString() {
        return "Turnera{" +
                "turno=" + turno +
                '}';
    }
}
