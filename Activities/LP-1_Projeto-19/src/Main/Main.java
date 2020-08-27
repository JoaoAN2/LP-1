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
        Processamento Processamento = new Processamento();
        Saída Saída = new Saída();
        
        int cont = 50;
        for (int i = 1; i <= cont; i++) {
            int x = Entrada.input("Digite o código de seu candidato: ");
            Processamento.contador(x);
        }
        
        Saída.print("Candidato 1 = ", Processamento.candidato_1);
        Saída.print("Candidato 2 = ", Processamento.candidato_2);
        Saída.print("Candidato 3 = ", Processamento.candidato_3);
        Saída.print("Candidato 4 = ", Processamento.candidato_4);
        Saída.print("Votos nulos = ", Processamento.voto_nulo);
        Saída.print("Votos Brancos = ", Processamento.voto_branco);
        
    }
    
}
