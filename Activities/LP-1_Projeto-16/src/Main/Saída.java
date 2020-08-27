package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoãoAN
 */
class Saída {
    
    public void print(double média, double presença, String RPN, String RPF){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String a = decimalFormat.format(média);
        String b = decimalFormat.format(presença);
        System.out.println("O aluno foi " + RPN + ", com a média de: " + a);
        System.out.println("O aluno foi " + RPF + ", com a presença de: " + b + "%");
        if(média >= 6 && presença >= 75){
            System.out.println("Status final: Aluno Aprovado!");
        }
        else{
            System.out.println("Status final: Aluno Reprovado!");
        }
    }
    
}
