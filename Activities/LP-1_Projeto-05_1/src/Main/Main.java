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
        Entrada Entrada = new Entrada();
        int a = Entrada.read_n("Digite o primeiro valor inteiro: ");
        int b = Entrada.read_n("Digite o segundo valor inteiro: ");
        
        Processamento Processamento = new Processamento();
        int resu = Processamento.sum(a, b);
        
        Saída Saída = new Saída();
        Saída.print("A soma de " + a + " + " + b + " é igual a: ", resu);
    }
    
}
