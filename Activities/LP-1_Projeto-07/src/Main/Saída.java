package Main;

import java.text.DecimalFormat;

/**
 *
 * @author JoãoAN
 */
class Saída {
    
    public void print(Double km_l, Double profits){
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println("A média de km/l é de: " + decimalFormat.format(km_l) + "KM/L");
        System.out.println("O lucro do dia é de: R$" + decimalFormat.format(profits));    
    }
    
}
