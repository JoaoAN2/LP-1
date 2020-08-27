package Main;

import java.util.Scanner;

/**
 *
 * @author JoãoAN
 */
class Entrada {
    
    Scanner teclado = new Scanner(System.in);
    
    public double input(String msg){
        double x;
        while(true){
            try {
                System.out.print(msg);
                x = teclado.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor double!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }
    
    public double verifier(String msg){
        double x;
        while(true){
            try {
                System.out.print(msg);
                x = teclado.nextDouble();
                while(x == 0){
                    System.out.print("O valor de \"a\" é igual a 0! Por favor, digite outro valor: ");
                    x = teclado.nextDouble();
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor double!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }
}