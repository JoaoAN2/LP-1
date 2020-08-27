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
        
        /*1) Faça um algoritmo para ler dois inteiros (variáveis A e B) e 
        imprimir o resultado do quadrado da diferença do primeiro valor pelo 
        segundo.*/
        
        Entrada Entrada = new Entrada();
        int a = Entrada.input("Digite o primeiro valor inteiro: ");
        int b = Entrada.input("Digite o segundo valor inteiro: ");
        
        Processamento Processamento = new Processamento();
        int res = Processamento.process(a, b);
        
        Saída Saída = new Saída();
        Saída.print(res);
        
    }
    
}
