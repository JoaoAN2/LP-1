package Main;

import java.util.Scanner;

/**
 *
 * @author JoãoAN
 */
class Entrada {
    
    Scanner teclado = new Scanner(System.in);
    
    public double input(String msg){
        double x = 0;
        while(true){
            try {
                System.out.print(msg);
                x = teclado.nextDouble();
                break;
            } 
            catch (Exception e) {
                System.out.println("Por favor, digite um valor double! ");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }
    
}
