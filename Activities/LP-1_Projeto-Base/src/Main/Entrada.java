package Main;

import java.util.Scanner;

/**
 *
 * @author JoãoAN
 */
class Entrada {
    
    Scanner teclado = new Scanner(System.in);
    
    public int read_n(String msg){
        int x = 0;
        while(true){
            try {
                System.out.println(msg);
                x = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Erro, Digite um número inteiro: ");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }
    
    public double read_d(String msg){
        double x = 0;
        while(true){
            try {
                System.out.println(msg);
                x = teclado.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Erro, Digite um double: ");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }
    
    
}
