package Main;

/**
 *
 * @author JoãoAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    /*Um professor atribui pesos de 1 a 4 para as notas de quatro avaliações.
    A nota é calculada por meio da média ponderada (N1 + N2*2 + N3*3 + N4*4)/10,
    onde N1 é a nota da primeira avaliação, N2 a da segunda, etc.. Faça um
    programa que calcula a média ponderada.
    */
    
    public static void main(String[] args) {
        Entrada Entrada = new Entrada();
        double n1 = Entrada.read_d("Digite o valor da primeira nota: ");
        double n2 = Entrada.read_d("Digite o valor da segunda nota: ");
        double n3 = Entrada.read_d("Digite o valor da terceira nota: ");
        double n4 = Entrada.read_d("Digite o valor da quarta nota: ");
        
        Processamento Processamento = new Processamento();
        double resu = Processamento.sum(n1, n2, n3, n4);
        
        Saída Saída = new Saída();
        Saída.print_double("As notas inseridas são respectivamente: " + n1 + ", " + n2 + ", " + n3 + " e " + n4 + "\nA média desse aluno é de: " , resu);
    }
    
}
