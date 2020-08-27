package Main;

/**
 *
 * @author JoãoAN
 */
class Processamento {
    //Cada caixa de azulejos possui 1,5 m^2.
    
    public double tile_boxes(double length, double height, double width){
        double total_tile_boxes = ((length * height) * 2 + (width * height) * 2)/1.5;
        return total_tile_boxes;
    }
}
