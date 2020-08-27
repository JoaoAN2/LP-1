package Main;

/**
 *
 * @author JoãoAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        2) Construa um programa que, tendo como dados de entrada dois pontos
        quaisquer no plano, P(x1,y1) e P(x2,y2), escreva a distância entre eles.
        A fórmula que efetua tal cálculo é: 
        d = math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))
        */        
        
        Entrada Entrada = new Entrada();
        double x1 = Entrada.input("Digite o valor de x1: ");
        double x2 = Entrada.input("Digite o valor de x2: ");
        double y1 = Entrada.input("Digite o valor de y1: ");
        double y2 = Entrada.input("Digite o valor de y2: ");
        
        Processamento Processamento = new Processamento();
        double d = Processamento.distância(x1, x2, y1, y2);
        
        Saída Saída = new Saída();
        Saída.print(d);
    }
    
}
