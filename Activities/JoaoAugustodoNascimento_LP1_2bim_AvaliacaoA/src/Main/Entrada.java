package Main;

import java.util.Scanner;

/**
 *
 * @author JoaoAN
 */
class Entrada {
    
    Scanner teclado = new Scanner(System.in);
    
    public double input(String msg){
        double x;
        while(true){
            try {
                System.out.print(msg);
                x = teclado.nextDouble();
                while(x < 0 || x > 10){
                    System.out.println("Erro! Digite um valor double inteiro entre 0 à 10!");
                    System.out.print(msg);
                    x = teclado.nextDouble();
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um número double!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }    
}
