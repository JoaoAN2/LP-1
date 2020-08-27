package Main;

/**
 *
 * @author JoãoAN
 */
class Processamento {

    public double delta(double a, double b, double c){
        double delta = Math.pow(b,2) - 4 * a * c;
        return delta;
    }
    
    public double x1(double a, double b, double c, double delta){
        double x1 = 0;
        if(delta == 0){
            x1 = - b/(2*a);
        }
        else if(delta > 0){
            x1 = (-b + Math.sqrt(delta))/(2 * a);
        }
        return x1;
    }
    
    public double x2(double a, double b, double c, double delta){
        double x2 = 0;
        if(delta > 0){
            x2 = (-b - Math.sqrt(delta))/(2 * a);
        }
        return x2;
    }
}
