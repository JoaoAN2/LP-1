package Main;

/**
 *
 * @author JoaoAN
 */
class Processamento {
    public double total_preço(int camiseta, double preço){
        return camiseta * preço;
    }
    
    public double total_vendaCada(double total_preço){
        return total_preço + (total_preço * 0.55);
    }
    
    public double total_custo(double a, double b, double c){
        return a + b + c;
    }
    
    public double total(double total_custo){
        return total_custo + (total_custo * 0.55);
    }
    
    public double lucro(double total, double total_custo){
        return total - total_custo;
    }
}