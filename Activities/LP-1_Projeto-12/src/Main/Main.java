package Main;

/**
 *
 * @author JoãoAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        3) Em épocas de pouco dinheiro, os comerciantes estão procurando 
        aumentar suas vendas oferecendo descontos. Faça um programa que possa
        receber um valor de um produto e o valor do desconto (em porcentagem);
        calcule e mostre o valor do desconto (em R$) e o valor a ser pago.
        Por exemplo, um tênis custa R$150,00 e será vendido com desconto de 10%.
        O valor do desconto é de R$15,00 e o valor a ser pago é de R$135,00.
        */
        
        Entrada Entrada = new Entrada();
        double product = Entrada.input("Digite o valor do produto: R$");
        double sale = Entrada.input("Digite o valor do desconto (Em porcentagem!): %");
        
        Processamento Processamento = new Processamento();
        double off = Processamento.sale(product, sale);
        double total = Processamento.total(product, off);
        
        Saída Saída = new Saída();
        Saída.print(off, product, total);
        
    }
    
}
