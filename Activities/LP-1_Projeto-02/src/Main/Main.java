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
        
        /*
        °Celsius
        */
        
        System.out.println("Digite o valor em Graus Celsius: ");
        float celsius = teclado.nextFloat();
        
        //Processamento
        
        /*
        Farenheit = ( °C × 9/5) + 32
        */
        
        float fahrenheit = (celsius * 9/5) + 32;
        
        //Saída
        System.out.println("A conversão de " + celsius + "°C é de " + fahrenheit +"°F");
        
    }
    
}
