package Main;

/**
 *
 * @author JoãoAN
 */
class Processamento {
    
    public double average(double n1, double n2, double n3, double n4){
        double res = (n1 + n2 + n3 + n4)/4;
        return res;
    }
    
    public double presença(int aula, int faltas){
        double presença = 100 - ((faltas * 100)/aula);
        return presença;
    }
    
    public String rpn(double média){
        String rpn;
        if(média >= 6.0){
            rpn = "Aprovado pela média";
        }
        else{
            rpn = "Reprovado pela média";
        }
        return rpn;
    }
    
    public String rpf(double presença){
        String rpf;
        if(presença >= 75){
            rpf = "Aprovado pela presença";
        }
        else{
            rpf = "Reprovado por Falta";
        }
        return rpf;
    }
}