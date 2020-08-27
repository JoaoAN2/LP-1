package Main;

/**
 *
 * @author JoãoAN
 */
public class Main {

    /**
     * Leia 15 valores inteiros positivos. (Entrada)
     * encontre o maior valor; (Processamento)
     * encontre o menor valor; (Processamento)
     * calcule a média dos números lidos. (Processamento)
     * Mostre os três valores acima. (Saída)
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Entrada Entrada = new Entrada();
        Processamento Processamento = new Processamento();
        Saída Saída = new Saída();
        
        int cont = Entrada.input("Digite a quantidade de valores: ");
        for (int i = 1; i <= cont; i++) {
            int x = Entrada.input("Digite o " + i + "° valor: ");
            Processamento.average(x, cont);
            Processamento.bigger(x);
            Processamento.smaller(x);
            if( i == cont){
                Saída.print("A média desses valores é: ", Processamento.average(0, 0));
                Saída.print("O maior valor é: ", Processamento.bigger(x));
                Saída.print("O menor valor é: ", Processamento.smaller(x));
                break;
            }
        }
    }
}
