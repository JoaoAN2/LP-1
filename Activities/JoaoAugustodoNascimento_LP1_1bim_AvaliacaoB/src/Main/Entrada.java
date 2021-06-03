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
                while(x <= 0){
                    System.out.println("Erro! o valor é menor ou igual a zero! Por favor, Digite um número double positivo!");
                    System.out.print(msg);
                    x = teclado.nextDouble();
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro! Por favor, digite um número double positivo!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }
}
