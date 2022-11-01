package EJ13;

public class SuperHeroe {
    private String nombre;
    private int fuerza,resistencia,superpoderes;


    public SuperHeroe(String nombre, int fuerza, int resistencia, int superpoderes) {
        setNombre(nombre);
        setFuerza(fuerza);
        setResistencia(resistencia);
        setSuperpoderes(superpoderes);
    }

    public String competir(SuperHeroe sup){
        if ((fuerza>sup.getFuerza() && (resistencia>sup.getResistencia() || superpoderes>sup.getSuperpoderes()))||
                (resistencia > sup.getResistencia() && superpoderes > sup.getSuperpoderes())){
            return "VICTORIA";
        } else if ((fuerza<sup.getFuerza() && (resistencia<sup.getResistencia() || superpoderes<sup.getSuperpoderes())||
                resistencia<sup.getResistencia() && superpoderes<sup.getSuperpoderes())) {
            return "DERROTA";
        }else return "EMPATE";

    }

    public String getNombre() {
        return nombre;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getFuerza() {
        return fuerza;
    }
    private void setFuerza(int fuerza) {
        if (fuerza>100)
            this.fuerza = 100;
        else if (fuerza<0) {
            this.fuerza = 0;
        }
        else
            this.fuerza = fuerza;
    }
    public int getResistencia() {
        return resistencia;
    }

    private void setResistencia(int resistencia) {
        if ((resistencia > 100)) {
            this.resistencia = 100;
        } else {
            this.resistencia = Math.max(resistencia, 0);
        }

    }

    public int getSuperpoderes() {
        return superpoderes;
    }

    private void setSuperpoderes(int superpoderes) {
        if (superpoderes>100)
            this.superpoderes = 100;
        else if (superpoderes<0) {
            this.superpoderes = 0;
        }
        else
            this.superpoderes = superpoderes;
    }

    @Override
    public String toString() {
        return "SuperHeroe{" +
                "nombre='" + nombre + '\'' +
                ", fuerza=" + fuerza +
                ", resistencia=" + resistencia +
                ", superpoderes=" + superpoderes +
                '}';
    }
}
