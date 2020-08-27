package Main;

import java.util.Scanner;

/**
 *
 * @author JoãoAN
 */
class Entrada {

//Entrada continua a mesma dos outros exercícios (Leitura das notas)
    
    Scanner teclado = new Scanner(System.in);
    
    public int read_n(String msg){
        System.out.println(msg);
        int x = teclado.nextInt();
        return x;
    }
    public double read_d(String msg){
        System.out.println(msg);
        double x = teclado.nextDouble();
        return x;
    }
    
    
}
