package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoaoAN
 */
class Saída {
    
    public void print_double(String msg, double x){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String res = decimalFormat.format(x);
        System.out.println(msg + res);
    }
    
    public void print_char(String msg, char x){
        System.out.println(msg + x);
    }
    
    public void print_string(String msg, String x){
        System.out.println(msg + x);
    }
}
