package Main;

import java.util.Scanner;

/**
 *
 * @author JoaoAN
 */
class Entrada {
    
    Scanner teclado = new Scanner(System.in);
    
    public int input_camisetas(String msg){
        int x;
        while(true){
            try {
                System.out.print(msg);
                x = teclado.nextInt();
                while(x < 0){
                    System.out.println("Erro! Digite um valor inteiro maior ou igual a 0!");
                    System.out.print(msg);
                    x = teclado.nextInt();
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor inteiro maior ou igual a 0!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }
    
    public double input_preços(String msg){
        double x;
        while(true){
            try {
                System.out.print(msg);
                x = teclado.nextDouble();
                while(x < 0){
                    System.out.println("Erro! Digite um valor double positivo!");
                    System.out.print(msg);
                    x = teclado.nextDouble();
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor double positivo!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }
    
}
