package Main;

/**
 *
 * @author jo_ao
 */
public class Processamento {
    
    public int sumOfTwoNumbersInt(int a, int b){
        return a + b;
    }
    
    public double winRate(int a, int b){
        return (Double.valueOf(a)/Double.valueOf(b))*100;
    }
    
    public double conversionDouble(String x){
        x = x.replace(',', '.');
        return Double.valueOf(x);
    }
}
