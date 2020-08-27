package Main;

/**
 *
 * @author JoãoAN
 */
class Processamento {
    public double average_Km_L(double km_1, double km_2, double fuel){
        double km_day = km_2 - km_1;
        double km_l = km_day/fuel;
        return km_l;
    }
    
    public double profits(double fuel, double earnings){
        double fuel_l = 3.90;
        double fuel_total = fuel * fuel_l;
        double profits = earnings - fuel_total;
        return profits;
    }
}
