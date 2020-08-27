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
        
        /*3) Construa um algoritmo para calcular as raízes de uma equação do 
        2º grau, sendo que os valores A, B e C são fornecidos pelo usuário. 
        Utilizar a fórmula de Bhaskara.*/
        
        Entrada Entrada = new Entrada();
        double a = Entrada.verifier("Digite o valor de a: ");
        double b = Entrada.input("Digite o valor de b: ");
        double c = Entrada.input("Digite o valor de c: ");
        
        Processamento Processamento = new Processamento();
        double delta = Processamento.delta(a, b, c);
        double x1 = Processamento.x1(a, b, c, delta);
        double x2 = Processamento.x2(a, b, c, delta);
        
        Saída Saída = new Saída();
        Saída.print(x1, x2, delta);
        
    }
    
}