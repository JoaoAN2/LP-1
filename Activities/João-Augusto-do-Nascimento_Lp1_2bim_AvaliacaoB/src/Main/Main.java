package Main;

/**
 *
 * @author mari e joao
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Entrada Entrada = new Entrada();
        Processamento Processamento = new Processamento();
        Saída Saída = new Saída();

        int escolha;
        do {
            Entrada.escolha();
            escolha = Entrada.input_escolha("\nDigite um valor de 1 à 6: ");
            switch (escolha) {
                case 1:
                    System.out.println("\nVocê escolheu Hipotenusa!");
                    double cateto_a = Entrada.input_doublePositivo("\nDigite o valor do primeiro cateto: ");
                    double cateto_b = Entrada.input_doublePositivo("Digite o valor do segundo cateto: ");

                    double hipotenusa = Processamento.pitágoras(cateto_a, cateto_b);
                    Saída.print_double("\nA hipotenusa desse triângulo é de: ", hipotenusa);
                    break;
                case 2:
                    System.out.println("\nVocê escolheu Bhaskara!");
                    double valor_a = Entrada.input_doubleA("\nDigite o valor de a: ");
                    double valor_b = Entrada.input_double("Digite o valor de b: ");
                    double valor_c = Entrada.input_double("Digite o valor de c: ");

                    double delta = Processamento.delta(valor_a, valor_b, valor_c);
                    double bhaskara_x1 = Processamento.bhaskaraA(delta, valor_a, valor_b, valor_c);
                    double bhaskara_x2 = Processamento.bhaskaraB(delta, valor_a, valor_b, valor_c);

                    Saída.print_bhaskara(delta, bhaskara_x1, bhaskara_x2);
                    break;
                case 3:
                    System.out.println("\nVocê escolheu Distância entre dois pontos!");
                    double x1 = Entrada.input_double("Digite o valor do primeiro ponto no eixo \"X\": ");
                    double y1 = Entrada.input_double("Digite o valor do primeiro ponto no eixo \"Y\": ");
                    double x2 = Entrada.input_double("Digite o valor do segundo ponto no eixo \"X\": ");
                    double y2 = Entrada.input_double("Digite o valor do segundo ponto no eixo \"Y\": ");

                    double distância = Processamento.distânciaAB(x1, x2, y1, y2);

                    Saída.print_double("\nA distância entre esses dois pontos é de: ", distância);
                    break;
                case 4:
                    System.out.println("\nVocê escolheu, Maior e Menor!\n");
                    int n;
                    do {
                        n = Entrada.input_int("Digite um valor inteiro positivo, quando quiser encerrar, insira um valor INTEIRO NEGATIVO: ");

                        Processamento.contador(n);
                    } while (n >= 0);
                    System.out.println("Programa finalizado!");
                    
                    int menor = Processamento.menor;
                    int maior = Processamento.maior;
                    
                    if(maior != Integer.MIN_VALUE){
                        Saída.print_int("\nO menor valor digitado é de: ", menor);
                        Saída.print_int("O maior valor digitado é de: ", maior);
                    }
                    else{
                        System.out.println("\nNão foi digitado nenhum valor!");
                    }
                    
                    Processamento.menor = Integer.MAX_VALUE;
                    Processamento.maior = Integer.MIN_VALUE;
                    break;
                case 5:
                    System.out.println("\nVocê escolheu Fibonacci!\n");
                    int ocorrência = Entrada.input_intPositivo("Digite a posição do valor em Fibonacci: ");

                    int fibonacci = Processamento.resFibonacci(ocorrência);

                    Saída.print_int("\nO valor encontrado na ocorrência " + ocorrência + " é de: ", fibonacci);
                    break;
                }   
            if (escolha != 6) {
                Saída.pausa();
            }
        } while (escolha != 6);
        System.out.println("\nFIM DO PROGRAMA!!");
    }

}
