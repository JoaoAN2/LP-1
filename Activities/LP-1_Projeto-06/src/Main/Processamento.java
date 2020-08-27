package Main;

/**
 *
 * @author JoãoAN
 */
class Processamento {
    
    //(N1 + N2*2 + N3*3 + N4*4)/10
    
    public int sum(int  a, int b, int c, int d){
        int res = (a + b*2 + c*3 + d*4)/10;
        return res;        
    }
    public double sum(double  a, double b, double c, double d){
        double res = (a + b*2 + c*3 + d*4)/10;
        return res;        
    }
}
