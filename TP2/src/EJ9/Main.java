package EJ9;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria(Tipo.CAJA_DE_AHORRO,new Persona("12345678","Fulano","Gómez",
                new Domicilio("Yatay","Almagro","240")));

        CuentaBancaria cuentaBancaria2 = new CuentaBancaria(Tipo.CUENTA_CORRIENTE,new Persona("9123456","Mengana","Torres",
                new Domicilio("Yatay","Almagro","240")));

        System.out.println( cuentaBancaria+ "\n"+ cuentaBancaria2);

    }
}
