package Main;

/**
 *
 * @author JoãoAN
 */
public class Main {

    /**
     * Inserir um valor (Entrada)
     * Retornar a tabuada desse valor (Processamento)
     * Mostrar os resultado (Valor * cont = res)
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Entrada Entrada = new Entrada();
        Processamento Processamento = new Processamento();
        Saída Saída = new Saída();
        
        int x = Entrada.input("Digite o valor da tabuada: ");
        int cont = 10;
        for (int i = 0; i <= cont; i++) {
            int res = Processamento.tab(x,i);
            Saída.print(x,i,res);
        }
    }
    
}
