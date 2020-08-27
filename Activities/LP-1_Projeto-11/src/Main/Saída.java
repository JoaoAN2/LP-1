package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoãoAN
 */
class Saída {
    
    public void print(double d){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println("A distância entre os pontos é de: " + decimalFormat.format(d));
    }
}
