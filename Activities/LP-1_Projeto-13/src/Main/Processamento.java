package Main;

/**
 *
 * @author JoãoAN
 */
class Processamento {
    
    public double brl(double usd, double cotação, double eur, double euro_rate){
        double brl = (usd * cotação) + (eur * euro_rate);
        return brl;
    }
    
}
