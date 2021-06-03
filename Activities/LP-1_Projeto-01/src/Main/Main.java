package Main;

import java.util.Scanner;

/**
 *
 * @author JoãoAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int a = teclado.nextInt();
        
        System.out.println("Digite um valor: ");
        int b = teclado.nextInt();
        
        //Processamento
        int soma = a + b;

        //Saída
        System.out.println("A soma dos valores é igual a: " + soma);
    }
}    
