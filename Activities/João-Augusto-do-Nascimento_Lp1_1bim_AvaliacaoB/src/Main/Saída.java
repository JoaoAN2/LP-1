package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoaoAN
 */
class Saída {
     
    public void print_double(String msg, double x, String msg_1){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String res = decimalFormat.format(x);
        System.out.println(msg + res + msg_1);
    }
    
    public void print_int(String msg, int x, String msg_1){
    //Se caso não tiver que comprar sacos de 10 ou 20 KG, o programa não vai imprimir a quantidade a ser comprada desses sacos!
        if(x > 0){    
            System.out.println(msg + x + msg_1);
        }
    }   
}