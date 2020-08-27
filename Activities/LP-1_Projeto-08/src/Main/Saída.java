package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoãoAN
 */
class Saída {
    
    public void print(double área){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println("A área desse circulo é de: " + decimalFormat.format(área));
    }
    
}
