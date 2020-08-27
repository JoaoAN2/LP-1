package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoãoAN
 */
class Saída {
    
    public void print(double x1, double x2, double delta){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String res_1 = decimalFormat.format(x1);
        String res_2 = decimalFormat.format(x2);
        if(delta < 0){
            System.out.println("A equação não possui valores possíveis dentro dos reais!");
        }
        else if(delta == 0){
            System.out.println("A equação possuí um valor possível: S[" + res_1 + "]");
        }
        else if(delta > 0){
            System.out.println("A equação possuí dois valores possíveis: S[" + res_1 + " , " + res_2 + "]");
        }
    }    
}