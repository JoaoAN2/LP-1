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
                System.out.println("Erro, Digite um valor double de seu salário ");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }
}
