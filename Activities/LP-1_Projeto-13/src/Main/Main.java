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
        
        /* 4) Faça um programa que calcule o valor em Reais, correspondente aos 
        dólares que um turista possui no cofre do hotel. O programa deve 
        solicitar a quantidade de dólares guardados no cofre e cotação do dólar
        naquele dia.*/
        
        Entrada Entrada = new Entrada();
        double usd = Entrada.input("Digite a quantidade de dólares guardados: $");
        double dollar_rate = Entrada.input("Digite a cotação do dólar: R$");
        
        double eur = Entrada.input("Digite a quantidade de euros guardados: €");
        double euro_rate = Entrada.input("Digite a cotação do Euro: R$");
        
        
        Processamento Processamento = new Processamento();
        double brl = Processamento.brl(usd, dollar_rate, eur, euro_rate);
        
        Saída Saída = new Saída();
        Saída.print(brl);
        
        /*5) Modifique o exercício 4 para que calcule e some o quanto em Reais o
        turista tem caso ele tenha Euros. Por exemplo, o turista tem US$120,00 
        com cotação de R$ 3,11 e tem €235,00 com cotação de R$3,51.
        Quanto ele tem em Reais?*/
        
        
    }
}
