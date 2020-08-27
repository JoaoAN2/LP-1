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
        double peso_1 = Entrada.input("Digite em quilogramas o peso do 1° cão: KG");
        double peso_2 = Entrada.input("Digite em quilogramas o peso do 2° cão: KG");
        double preço_ração = Entrada.input("Digite o valor do quilograma da ração: R$");
        
        //Considerei um mês de 30 dias!!
        
        Processamento Processamento = new Processamento();
        double qntd_1 = Processamento.qntd_raçãoAnimal(peso_1);
        double qntd_2 = Processamento.qntd_raçãoAnimal(peso_2);
        double porção1 = Processamento.porção(qntd_1);
        double porção2 = Processamento.porção(qntd_2);
        double sobras = Processamento.sobra(qntd_1, qntd_2);
        Processamento.min_sacos(qntd_1, qntd_2, sobras);
        int sacos_10kg = Processamento.sacos_10kg;
        int sacos_20kg = Processamento.sacos_20kg;
        double custo_diário1 = Processamento.custo_diário(qntd_1, preço_ração);
        double custo_diário2 = Processamento.custo_diário(qntd_2, preço_ração);
        double custo_mensal1 = Processamento.custo_mensal(custo_diário1);
        double custo_mensal2 = Processamento.custo_mensal(custo_diário2);
        double custo_mensalTotal = Processamento.custo_mensalT(custo_mensal1, custo_mensal2);
        
        Saída Saída = new Saída();
        Saída.print_double("\nO 1° cão come: ", qntd_1, "g de ração diárias.");
        Saída.print_double("O 2° cão come: ", qntd_2, "g de ração diárias.");
        Saída.print_double("O 1° cão come: ", porção1, "g de ração por porção.");
        Saída.print_double("O 2° cão come: ", porção2, "g de ração por porção.");
        //Considerando que haja sobra no mês anterior como o enunciado sujere :)
        Saída.print_int("Terá que comprar para o mês ", sacos_20kg, " Saco(s) de 20KG");
        Saída.print_int("Também terar que comprar ", sacos_10kg, " saco de 10KG");
        //Considerando que haja sobra no mês anterior como o enunciado sujere :)
        Saída.print_double("O custo do 1° cão é de: R$", custo_diário1, " diários");
        Saída.print_double("O custo do 2° cão é de: R$", custo_diário2, " diários");
        Saída.print_double("O custo do 1° cão é de: R$", custo_mensal1, " mensais");
        Saída.print_double("O custo do 2° cão é de: R$", custo_mensal2, " mensais");
        Saída.print_double("O custo de ambos os cães é de: R$", custo_mensalTotal, " mensaís");
    }
}
