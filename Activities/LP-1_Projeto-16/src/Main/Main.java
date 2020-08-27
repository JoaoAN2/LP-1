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
        /*Faça um programa em Java que leia 4 notas (bimestrais), o total de
        aulas naquela disciplina, a quantidade de faltas que o aluno teve,
        calcule a média final e a situação do aluno. A situação é dada por:
        média igual ou acima de 6,0 e 75% de presenças o aluno está 
        APR (aprovado). Abaixo de 6,0 o aluno está RPN (reprovado por nota). 
        Acima de 25% de faltas está RPF (Reprovado por faltas).*/

        Entrada Entrada = new Entrada();
        int aulas = Entrada.aulas("Digite a quantidade de aulas em sua disciplina: ");
        int faltas = Entrada.faltas("Digite a quantidade de aulas que seu aluno faltou: ", aulas);
        double nota_1 = Entrada.notas("Digite a nota do 1° Bimestre: ");
        double nota_2 = Entrada.notas("Digite a nota do 2° Bimestre: ");
        double nota_3 = Entrada.notas("Digite a nota do 3° Bimestre: ");
        double nota_4 = Entrada.notas("Digite a nota do 4° Bimestre: ");

        Processamento Processamento = new Processamento();
        double média = Processamento.average(nota_1, nota_2, nota_3, nota_4);
        double presença = Processamento.presença(aulas, faltas);
        String RPN = Processamento.rpn(média);
        String RPF = Processamento.rpf(presença);
        
        Saída Saída = new Saída();
        Saída.print(média, presença, RPN, RPF);
        
    }

}
