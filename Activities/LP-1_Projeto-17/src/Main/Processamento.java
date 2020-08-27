package Main;

/**
 *
 * @author JoãoAN
 */
class Processamento {

    int soma = 0;
    int cont_1 = 0;
    int average = 0;
    int bigger = Integer.MIN_VALUE;
    int smaller = Integer.MAX_VALUE;
    
    public double average(int n, int cont) {
        soma = soma + n;
        cont_1++;
        if(cont_1 == cont){
            average = soma/cont;
        }
        return average;
    }

    public int bigger(int n) {
        if(bigger < n){
            bigger = n;
        }
        return bigger;
    }

    public int smaller(int n) {
        if(smaller > n){
            smaller = n;
        }
        return smaller;
    }
    
}
