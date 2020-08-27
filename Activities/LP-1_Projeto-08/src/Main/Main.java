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
        
        Scanner teclado = new Scanner(System.in);
        
        /* 4) Escreva um programa para ler o raio de um círculo,
        calcular e escrever a sua área. A = pi*r^2.
        */
        
        Entrada Entrada = new Entrada();
        double radius = Entrada.input("Digite o valor do raio: ");
        
        Processamento Processamento = new Processamento();
        double área = Processamento.área(radius);
        
        Saída Saída = new Saída();
        Saída.print(área);
    }
    
}
