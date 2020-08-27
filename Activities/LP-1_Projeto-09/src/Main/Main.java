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
        
        /*
        5) Escreva um programa para ler as dimensões de uma cozinha retangular
        (comprimento, largura e altura), calcular e escrever a quantidade de
        caixas de azulejos para se colocar em todas as suas paredes (considere
        que não será descontada a área ocupada por portas e janelas). Cada caixa
        de azulejos possui 1,5 m^2.
        */
        
        Entrada Entrada = new Entrada();
        double length = Entrada.input("Digite o comprimento da cozinha: ");
        double height = Entrada.input("Digite a altura da cozinha: ");
        double width = Entrada.input("Digite a largura da cozinha: ");
        
        Processamento Processamento = new Processamento();
        double res = Processamento.tile_boxes(length, height, width);
        
        Saída Saída = new Saída();
        Saída.print(res);
        
    }
    
}
