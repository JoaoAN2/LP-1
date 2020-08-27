package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoãoAN
 */
class Saída {
    
    public void print(String msg, double x){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String average = decimalFormat.format(x);
        System.out.println(msg + average);
    }
}
