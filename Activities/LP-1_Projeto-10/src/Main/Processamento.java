package Main;

/**
 *
 * @author JoãoAN
 */
class Processamento {
    
    /*
    salário fixo por mês, paga imposto de 6% sobre o fixo, e recebe uma comissão de 5%
    */
    public double total_salary(double comission, double fixed_salary){
        double total = fixed_salary - (fixed_salary*0.06) + comission * 0.05;
        return total;
    }
}
