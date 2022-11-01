package EJ9;


public class CuentaBancaria {
    private String CBU;
    private String tipo;
    private double saldo;
    private Persona titular;

    public CuentaBancaria(String tipo, Persona titular) {
        this.tipo = tipo;
        this.titular = titular;
        this.saldo =0;
        generarCBU();
    }

    public void generarCBU(){
        if (tipo.equals("CA"))
            this.CBU = "11-"+ titular.getDNI()+ "-"+titular.getDNI().charAt(7);
        else this.CBU = "12-"+ titular.getDNI()+ "-"+titular.getDNI().charAt(7);
    }

    public double obtenerSaldo(){
        return saldo;
    }

    public void depositar(Double monto){
        this.saldo += monto;
    }

    public void extraer(Double monto){
        if (monto>saldo)
            System.out.println("saldo insuficiente");
        else {
            saldo -= monto;
            System.out.println("retiraste $"+monto+"\n"+"------------"+"\n"+ "tu saldo es: "+saldo);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "CBU='" + CBU + '\'' +
                ", tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                ", titular=" + titular +
                '}';
    }
}
