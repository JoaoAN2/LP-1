package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoaoAN
 */
class Saida {
    
    public void print(String msg, String res){
        System.out.println(msg + res);
    }
    
    public void printInt(String msg, int res){
        System.out.println(msg + res);
    }
    
    public void printDouble(String msg, double res){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println(msg + decimalFormat.format(res));
    }
    
}
