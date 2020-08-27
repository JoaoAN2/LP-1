package Main;

import java.util.Scanner;

/**
 *
 * @author JoãoAN
 */
class Entrada {
    
    Scanner teclado = new Scanner(System.in);
    
    public int input(String msg){
        int x;
        while(true){
            try {
                System.out.print(msg);
                x = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um número inteiro!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }
}
