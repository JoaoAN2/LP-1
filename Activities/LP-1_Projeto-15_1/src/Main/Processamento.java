package Main;

import java.text.DecimalFormat;


/**
 *
 * @author JoãoAN
 */
class Processamento {

    public double delta(double a, double b, double c){
        double delta = Math.pow(b,2) - 4 * a * c;
        return delta;
    }
    
    public String bhaskara(double a, double b, double c, double delta){
        double x;
        double y;
        String res = null;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        if(delta < 0){
            res = "Não possui valores possíveis";
        }
        if(delta == 0){
            x = - b/(2*a);
            res = "Possuí um valor possível: S[" + decimalFormat.format(x) + "]";
        }
        if(delta > 0){
            x = (-b + Math.sqrt(delta))/(2 * a);
            y = (-b - Math.sqrt(delta))/(2 * a);
            res = "Possui dois valores possíveis: S[" + decimalFormat.format(x) + ", " + decimalFormat.format(y) + "]";
        }
        return res;
    }
}
