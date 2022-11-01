package EJ7;

public class Computadora {
    private String marca;
    private enum tipo{
        DESKTOP,LAPTOP,ALL_IN_ONE
    }
    private Processador processador;
    private Dvd dvd;

    public void prender(){
        System.out.println("encendida");
    }

    public void apagar(){
        System.out.println("apagado");
    }

    public void reinciar(){
        System.out.println("reiniciando");
    }



}
