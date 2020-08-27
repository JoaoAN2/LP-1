package Main;

/**
 *
 * @author JoãoAN
 */
class Processamento {
    
    //d = math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))
    
    public double distância(double x1, double x2, double y1, double y2){
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return d;
    }
    
}
