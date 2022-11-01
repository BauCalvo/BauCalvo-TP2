package EJ8;

public class TarjetaDeCredito {
    private String numero, titular;
    private double limiteDecompra,acomuladorActual;

    public TarjetaDeCredito(String numero, String titular, double limiteDecompra) {
        setNumero(numero);
        setTitular(titular);
        setLimiteDecompra(limiteDecompra);
        this.acomuladorActual = 0;


    }
    public boolean compraPosible(double monto){
        if (acomuladorActual+monto <= limiteDecompra)
            System.out.println("se puedo realizar la compra");
        else System.out.println("fondos inscuficientes");
        return acomuladorActual+monto <= limiteDecompra;
    }


    public double montoDisponible(){
        return limiteDecompra <= acomuladorActual ? 0: limiteDecompra-acomuladorActual;
    }

    public void actualizarLimite(double limiteDecompra) {
        this.limiteDecompra = limiteDecompra;
    }

    public void acumularGastoActual(double monto){
        this.acomuladorActual += monto;
    }

    public boolean realizarCompra(double monto){
        if (compraPosible(monto)){
            acumularGastoActual(monto);
            return true;
        }
        else return false;
    }


    private void setNumero(String numero) {
        this.numero = numero;
    }
    private void setTitular(String titular) {
        this.titular = titular;
    }
    private void setLimiteDecompra(double limiteDecompra) {
        this.limiteDecompra = limiteDecompra;
    }

    public String getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    public double getLimiteDecompra() {
        return limiteDecompra;
    }
    public double getAcomuladorActual() {
        return acomuladorActual;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
                "numero='" + numero + '\'' +
                ", titular='" + titular + '\'' +
                ", limiteDecompra=" + limiteDecompra +
                ", acomuladorActual=" + acomuladorActual +
                ", monto disponible=" + montoDisponible() +
                '}';
    }
}
