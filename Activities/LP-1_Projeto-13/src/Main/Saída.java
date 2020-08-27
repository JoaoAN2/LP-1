package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoãoAN
 */
class Saída {
    
    public void print(double brl){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println("A conversão final em BRL é de: R$" + decimalFormat.format(brl));
    }
    
}
