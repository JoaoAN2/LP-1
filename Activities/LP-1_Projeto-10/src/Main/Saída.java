package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoãoAN
 */
class Saída {
    
    public void print(double total){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println("O Valor total de seu salário é de: " + total);
    }
    
}
