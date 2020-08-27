package Main;

import java.util.Scanner;

/**
 *
 * @author JoãoAN
 */
class Entrada {
    
    Scanner teclado = new Scanner(System.in);
    
    public int input(String msg) {
        int x = 0;
        while(true){
            try {
                    System.out.print(msg);
                    x = teclado.nextInt();
                    while(x <= 0 || x > 6){
                        System.out.println("Erro! Digite um valor entre 1 e 6!");
                        System.out.print(msg);
                        x = teclado.nextInt();
                    }
                    break;
                } 
            catch (Exception e){
                System.out.println("Erro! Digite um valor inteiro entre 1 e 6!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }
    
}
