package Main;

/**
 *
 * @author JoaoAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Entrada Entrada = new Entrada();
        int camisa_P = Entrada.input_camisetas("Digite a quantidade de camisetas pequenas: ");
        double preço_CP = Entrada.input_preços("Digite o preço de custo das camisetas pequenas: R$");
        int camisa_M = Entrada.input_camisetas("Digite a quantidade de camisetas médias: ");
        double preço_CM = Entrada.input_preços("Digite o preço de custo das camisetas média: R$");
        int camisa_G = Entrada.input_camisetas("Digite a quantidade de camisetas grandes: ");
        double preço_CG = Entrada.input_preços("Digite o preço das camisetas grandes: R$");

        Processamento Processamento = new Processamento();
        double total_P = Processamento.total_preço(camisa_P, preço_CP);
        double total_M = Processamento.total_preço(camisa_M, preço_CM);
        double total_G = Processamento.total_preço(camisa_G, preço_CG);
        double venda_P = Processamento.total_vendaCada(total_P);
        double venda_M = Processamento.total_vendaCada(total_M);
        double venda_G = Processamento.total_vendaCada(total_G);
        double unitária_P = Processamento.total(preço_CP);
        double unitária_M = Processamento.total(preço_CM);
        double unitária_G = Processamento.total(preço_CG);
        double valor_custo = Processamento.total_custo(total_P, total_M, total_G);
        double total_venda = Processamento.total(valor_custo);
        double lucro = Processamento.lucro(total_venda, valor_custo);

        Saída Saída = new Saída();
        Saída.print("O valor total de custos da camiseta \"P\" é de: R$", total_P);
        Saída.print("O valor total de custos da camiseta \"M\" é de: R$", total_M);
        Saída.print("O valor total de custos da camiseta \"G\" é de: R$", total_G);
        Saída.print("O valor total de vendas unitária da camiseta \"P\" é de: R$", unitária_P);
        Saída.print("O valor total de vendas unitária da camiseta \"M\" é de: R$", unitária_M);
        Saída.print("O valor total de vendas unitária da camiseta \"G\" é de: R$", unitária_G);
        Saída.print("O valor total de vendas da camiseta \"P\" é de: R$", venda_P);
        Saída.print("O valor total de vendas da camiseta \"M\" é de: R$", venda_M);
        Saída.print("O valor total de vendas da camiseta \"G\" é de: R$", venda_G);
        Saída.print("O valor total de custos de todas as camisetas é de: R$", valor_custo);
        Saída.print("O valor total de vendas de todas as camisetas é de: R$", total_venda);
        Saída.print("O lucro é de: R$", lucro);
    }

}