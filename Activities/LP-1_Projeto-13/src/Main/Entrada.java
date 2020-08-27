package Main;

import java.util.Scanner;

/**
 *
 * @author JoãoAN
 */
class Entrada {
    
    Scanner teclado = new Scanner(System.in);
    
    public double input(String msg){
        String x;
        double d;
        while(true){
            try {
                System.out.print(msg);
                x = teclado.next();
                x = x.replace("," , ".");
                d = Double.parseDouble(x);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro! Digite um valor double!");
                teclado = new Scanner(System.in);
            }
        }
        return d;
    }
}
