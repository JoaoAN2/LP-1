package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoaoAN
 */
class Saída {
    
    public void print(String msg, double x){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String resu = decimalFormat.format(x);
        System.out.println(msg + resu);
    }
    
}