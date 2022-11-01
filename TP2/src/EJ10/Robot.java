package EJ10;

public class Robot {
    public void saludar(){
        System.out.println("Hola, mi nombre es tito. ¿En qué puedo ayudarte?");
    }
    public void saludar(Persona persona){
        System.out.println("Hola "+persona.getNombre()+", mi nombre es tito. ¿En qué puedo ayudarte?");
    }
}
