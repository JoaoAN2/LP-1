package Main;

import java.util.Scanner;

/**
 *
 * @author JoãoAN
 */
class Entrada {
    
    Scanner teclado = new Scanner(System.in);
    
    public double values(String message){
        System.out.println(message);
        double x = teclado.nextDouble();
        return x;
    }
}
