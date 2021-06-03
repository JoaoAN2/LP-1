package Main;

/**
 *
 * @author JoaoAN
 */
class Processamento {
    
    int sacos_10kg;
    int sacos_20kg;
    
    public double qntd_raçãoAnimal(double x){
        double gramas = x * 1000;
        return gramas * 0.05;
    }
    
    public double porção(double x){
        return x/2;
    }
    
    public double sobra(double x, double y){
        System.out.println();
        return (((x + y)/1000) * 30)%10;
    }
    
    public void min_sacos(double x, double y, double sobra){
        //double peso_ração = Ração em KG usadas em 1 mês
        double peso_ração = (((x + y)/1000) * 30) - sobra;
        sacos_10kg = 0;
        sacos_20kg = 0;
        while(peso_ração > 0){
            if(peso_ração <= 10){
                sacos_10kg++;
                peso_ração = peso_ração - 10;
            } 
            if(peso_ração > 10 ){
                sacos_20kg++;
                peso_ração = peso_ração - 20;
            }
        }
    }
    
    public double custo_diário(double x, double y){
        x = x/1000;
        return x * y;
    }
    
    public double custo_mensal(double x){
        return x * 30;
    }
    
    public double custo_mensalT(double x, double y){
        return x + y;
    }
}
