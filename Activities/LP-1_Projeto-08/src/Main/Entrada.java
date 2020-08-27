package Main;

import java.util.Scanner;

/**
 *
 * @author JoãoAN
 */
class Entrada {
    
    Scanner teclado = new Scanner(System.in);
    
    public double input(String msg){
        System.out.println(msg);
        double x = teclado.nextDouble();
        return x;
    }
    
}
