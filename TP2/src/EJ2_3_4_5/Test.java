package EJ2_3_4_5;

public class Test {


    public static void main(String[] args) {
        //persona 1
        Persona persona = new Persona();
        persona.ponerNombre("Fulano");
        persona.ponerApellido("Gomez");
        System.out.println(persona.obtenerNombreCompleto());

        //persona2
        Persona persona1 = new Persona();
        persona1.ponerNombre("Ted");
        persona1.ponerApellido("Bunddy");
        System.out.println(persona1.obtenerNombreCompleto());

        //domicilio 1
        Domicilio domicilio = new Domicilio("Talcahuano","Buenos Aires","758");
        persona.ponerDomicilio(domicilio);
        persona.getDomicilio();
        persona1.ponerDomicilio(domicilio);
        domicilio.setCalle("Cordoba");
        System.out.println(persona + "\n" +persona1);


    }

}
