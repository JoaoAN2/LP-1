package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoãoAN
 */
class Saída {
    
    public void print(double res){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println("A quantidade de caixa de azulejos necessárias é de: " + decimalFormat.format(res));
    }
    
}
