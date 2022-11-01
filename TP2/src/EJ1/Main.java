package EJ1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2;
        Suma s = new Suma();
//        s.suma(2,3);
        Scanner input = new Scanner(System.in);
        System.out.println("ingres 1 numero");
        num1 = input.nextInt();
        System.out.println("ingres 1 numero");
        num2 = input.nextInt();
        s.pedirNumero(num1,num2);


    }
}
