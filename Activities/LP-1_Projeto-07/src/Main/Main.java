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
        Exercício: Um motorista de táxi deseja calcular o rendimento de seu carro
        na praça. Sabendo-se que o preço do combustível é de R$ 3,90 por litro, 
        escreva um programa para ler: a marcação do odômetro (Km) no início do 
        dia, a marcação (Km) no final do dia, o número de litros de combustível
        gastos e o valor total (R$) recebido dos passageiros. Calcular
        e escrever: a média do consumo em Km/L e o lucro (líquido) do dia.
        */
        
        Entrada Entrada = new Entrada();
        double km_start = Entrada.values("Digite o valor em km do odômetro do início do dia: ");
        double km_end = Entrada.values("Digite o valor em km do odômetro do final do dia: ");
        double fuel = Entrada.values("Digite o valor em litros de combustível gasto: ");
        double earnings = Entrada.values("Digite o valor de ganhos no dia: ");
        
        Processamento Processamento = new Processamento();
        double km_l = Processamento.average_Km_L(km_start, km_end, fuel);
        double profits = Processamento.profits(fuel, earnings);
        
        Saída Saída = new Saída();
        Saída.print(km_l, profits);
    }
    
}
