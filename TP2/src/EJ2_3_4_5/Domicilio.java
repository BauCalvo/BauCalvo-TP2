package EJ2_3_4_5;

public class Domicilio {

    private String calle,ciudad,numero;

    public Domicilio(String calle, String ciudad, String numero) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.numero = numero;
    }
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
                ", ciudad='" + ciudad + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
