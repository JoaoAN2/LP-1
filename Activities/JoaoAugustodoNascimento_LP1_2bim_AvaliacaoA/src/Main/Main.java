package Main;

/**
 *
 * @author JoanAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Entrada Entrada = new Entrada();
        double nota_1 = Entrada.input("Digite a 1° nota: ");
        double nota_2 = Entrada.input("Digite a 2° nota: ");
        double nota_3 = Entrada.input("Digite a 3° nota: ");
        double nota_4 = Entrada.input("Digite a 4° nota: ");
        
        Processamento Processamento = new Processamento();
        double média_anual = Processamento.média(nota_1, nota_2, nota_3, nota_4);
        double maior_nota = Processamento.maior(nota_1, nota_2, nota_3, nota_4);
        double menor_nota = Processamento.menor(nota_1, nota_2, nota_3, nota_4);
        char conceito_1 = Processamento.conceito(nota_1);
        char conceito_2 = Processamento.conceito(nota_2);
        char conceito_3 = Processamento.conceito(nota_3);
        char conceito_4 = Processamento.conceito(nota_4);
        char conceito_anual = Processamento.conceito(média_anual);
        String resultado = Processamento.res(conceito_anual);
        
        Saída Saída = new Saída();
        Saída.print_double("\nA média anual desse aluno é de: ", média_anual);
        Saída.print_double("A maior nota desse aluno é de: ", maior_nota);
        Saída.print_double("A menor nota desse aluno é de: ", menor_nota);
        Saída.print_char("O conceito do 1° bimestre desse aluno é de: ", conceito_1);
        Saída.print_char("O conceito do 2° bimestre desse aluno é de: ", conceito_2);
        Saída.print_char("O conceito do 3° bimestre desse aluno é de: ", conceito_3);
        Saída.print_char("O conceito do 4° bimestre desse aluno é de: ", conceito_4);
        Saída.print_char("O conceito anual desse aluno é de: ", conceito_anual);
        Saída.print_string("Esse aluno foi: " , resultado);        
    }
}