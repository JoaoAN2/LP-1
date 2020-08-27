package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoãoAN
 */
class Saída {
    public void print_int(String msg, int n){
        System.out.println(msg + " " + n);
    }
    
    public void print_double(String msg, double n){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println(msg + " " + decimalFormat.format(n));
    }
}
