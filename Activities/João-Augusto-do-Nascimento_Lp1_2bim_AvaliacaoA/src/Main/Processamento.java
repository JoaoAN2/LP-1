package Main;

/**
 *
 * @author JoaoAN
 */
class Processamento {
    
    public double média(double n1, double n2, double n3, double n4){
        return (n1 + n2 + n3 + n4)/4;
    }
    
    public double maior(double n1, double n2, double n3, double n4){
        double maior;
        if(n1 >= n2 && n1 >= n3 && n1 >= n4){
            return n1;
        }
        else if(n2 >= n1 && n2 >= n3 && n2 >= n4){
            return n2;
        }
        else if(n3 >= n1 && n3 >= n2 && n3 >= n4){
            return n3;
        }
        else{
            return n4;
        }
    }
    
    public double menor(double n1, double n2, double n3, double n4){
        if(n1 <= n2 && n1 <= n3 && n1 <= n4){
            return n1;
        }
        else if(n2 <= n1 && n2 <= n3 && n2 <= n4){
            return n2;
        }
        else if(n3 <= n1 && n3 <= n2 && n3 <= n4){
            return n3;
        }
        else{
            return n4;
        }
    }
    
    public char conceito(double média){
        char res;
        if(média < 4){
            return 'E';
        }
        else if(média < 6){
            return 'D';
        }
        else if(média < 7.5){
            return 'C';
        }
        else if(média < 9){
            return 'B';
        }
        else{
            return 'A';
        }
    }
    
    public String res(char conceito){
        if(conceito == 'A'|| conceito == 'B' || conceito == 'C'){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }
}
