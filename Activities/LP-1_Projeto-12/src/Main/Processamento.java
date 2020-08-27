package Main;

/**
 *
 * @author JoãoAN
 */
class Processamento {
    
    public double sale(double product, double sale){
        double off = product * (sale * 0.01);
        return off;
    }
    
    public double total(double product, double sale){
        double total = product - sale;
        return total;
    }
    
}
