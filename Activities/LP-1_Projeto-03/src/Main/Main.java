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
        
        System.out.println("Digite o valor do primeiro cateto: ");
        float Cateto_a = teclado.nextFloat();
        
        System.out.println("Digite o valor do segundo cateto: ");
        float Cateto_b = teclado.nextFloat();
        
        //Processamento
        float Hipotenusa = (float) Math.sqrt(Cateto_a * Cateto_a + Cateto_b * Cateto_b);
        
        //Saída
        System.out.println("O valor da hipotenusa deste trângulo retângulo é de: " + Hipotenusa);
        
    }
    
}
