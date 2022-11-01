package EJ7;

public class Processador {
    private String marca,modelo;
    private int temperatura;

    public void teperaturaCritica(){
        System.out.println(this.temperatura >= 75?"temperatura muy alta":"la temperatura esta bien" );
    }
}
