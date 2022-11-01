package EJ1;

import java.util.Random;
import java.util.Scanner;

public class Suma {

    public void suma(int num1,int num2){
        System.out.println("la suma entre " + num1 + " y "+num2 +" es "+ (num1+num2));
    }

    public void pedirNumero(int num1, int num2){
        Random r = new Random();
        System.out.println(r.nextInt(num1)+num2);
    }


}
