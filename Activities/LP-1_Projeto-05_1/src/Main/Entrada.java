package Main;

import java.util.Scanner;

/**
 *
 * @author JoãoAN
 */
class Entrada {
    Scanner teclado = new Scanner(System.in);
    
    public int read_n(String msg){
        System.out.println(msg);
        int x = teclado.nextInt();
        return x;
    }
}
