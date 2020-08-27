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
        double a = Entrada.read_d("Digite o primeiro valor double: ");
        double b = Entrada.read_d("Digite o segundo valor double: ");
        
        Processamento Processamento = new Processamento();
        double resu = Processamento.sum(a, b);
        
        Saída Saída = new Saída();
        Saída.print_double("A soma de " + a + " + " + b + " é igual a: ", resu);
    }
    
}
