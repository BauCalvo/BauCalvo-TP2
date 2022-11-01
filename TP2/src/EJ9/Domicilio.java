package EJ9;

public class Domicilio {

    private String calle, barrio,numero;

    public Domicilio(String calle, String barrio, String numero) {
        this.calle = calle;
        this.barrio = barrio;
        this.numero = numero;
    }
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", barrio='" + barrio + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}

