package EJ2_3_4_5;

public class Persona {
    private String nombre,apellido;
    private Domicilio domicilio;

    public Persona() {
    }

    public void ponerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ponerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerNombreCompleto(){
        return this.nombre +" "+ this.apellido;
    }

    public void ponerDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void getDomicilio() {
        System.out.println(this.domicilio != null ? this.domicilio:"no tienen un domicilio");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilio=" + domicilio +
                '}';
    }
}
