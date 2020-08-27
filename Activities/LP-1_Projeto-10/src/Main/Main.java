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
        EX 1) Um vendedor de uma loja recebe um salário fixo por mês, paga 
        imposto de 6% sobre o fixo, e recebe uma comissão de 5% sobre o total 
        de suas vendas. Desenvolva um programa em java que leia o salário fixo, 
        o total de vendas no mês e informe quanto esse vendedor deve receber.
        */
        
        Entrada Entrada = new Entrada();
        double fixed_salary = Entrada.input("Digite o valor de seu salário fixo: ");
        double commission = Entrada.input("Digite o total de vendas no mês: ");
        
        Processamento Processamento = new Processamento();
        double total_salary = Processamento.total_salary(commission, fixed_salary);
        
        Saída Saída = new Saída();
        Saída.print(total_salary);
        
    }
    
}
