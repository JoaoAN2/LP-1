package Main;

import Tools.DateTools;
import Tools.ManipulaArquivo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JoaoAN
 */
public class UI {

    private Entrada Entrada = new Entrada();
    private Processamento Processamento = new Processamento();
    private Saida Saida = new Saida();
    private ControleDeLista controleDeLista = new ControleDeLista();
    private ManipulaArquivo manipulaArquivo = new ManipulaArquivo();
    DateTools dateTools = new DateTools();
    int option = 0;

    public void createScreen() {
        int id = Entrada.input_intPositivo("Digite o ID da pessoa: ");
        FIDE_Player player = controleDeLista.read(id);
        if (player == null) {
            player = new FIDE_Player();
            player.setId(id);
            player.setName(Entrada.input("Nome do jogador: "));
            player.setFederation(Entrada.input("Federação (País): "));
            player.setBirthday(dateTools.inputDate("Ano de nascimento: "));
            player.setPointsFIDE(Entrada.input_intPositivo("Pontos FIDE: "));
            player.setMatchsWhite(Entrada.input_intPositivo("Partidas jogadas de brancas: "));
            player.setMatchsBlack(Entrada.input_intPositivo("Partidas jogadas de pretas: "));
            player.setMatchsTotal(Processamento.sumOfTwoNumbersInt(player.getMatchsWhite(), player.getMatchsBlack()));
            player.setVictoryWhite(Entrada.input_Victory("Partidas ganhas de brancas: ", player.getMatchsWhite()));
            player.setVictoryBlack(Entrada.input_Victory("Partidas ganhas de pretas: ", player.getMatchsBlack()));
            player.setVictoryTotal(Processamento.sumOfTwoNumbersInt(player.getVictoryBlack(), player.getVictoryWhite()));
            player.setWinRateWhite(Processamento.winRate(player.getVictoryWhite(), player.getMatchsWhite()));
            player.setWinRateBlack(Processamento.winRate(player.getVictoryBlack(), player.getMatchsBlack()));
            player.setWinRateTotal(Processamento.winRate(player.getVictoryTotal(), player.getMatchsTotal()));
            controleDeLista.create(player);
            System.out.println("\n");
        } else {
            System.out.println("Já está cadastrada!\n");
        }
    }

    public void readScreen() {
        int id = Entrada.input_int("Digite o ID da pessoa: ");
        FIDE_Player player = controleDeLista.read(id);
        if (player == null) {
            System.out.println("Não está cadastrado!");
        } else {
            
            System.out.println("\n");
            Saida.printInt("Id FIDE: ", player.getId());
            Saida.print("Nome do atleta: ", player.getName());
            Saida.print("Federação: ", player.getFederation());
            Saida.print("Ano de Nascimento ", dateTools.conversionDateToString(player.getBirthday()));
            Saida.printInt("Rating FIDE: ", player.getPointsFIDE());
            Saida.printInt("Partidas jogadas de brancas: ", player.getMatchsWhite());
            Saida.printInt("Partidas jogadas de negras: ", player.getMatchsBlack());
            Saida.printInt("Partidas jogadas: ", player.getMatchsTotal());
            Saida.printInt("Partidas ganhas de brancas: ", player.getVictoryWhite());
            Saida.printInt("Partidas ganhas de brancas: ", player.getVictoryBlack());
            Saida.printInt("Partidas ganhas no total: ", player.getVictoryTotal());
            Saida.printDouble("Aproveitamento de brancas: ", player.getWinRateWhite());
            Saida.printDouble("Aproveitamento de negras: ", player.getWinRateBlack());
            Saida.printDouble("Aproveitamento total: ", player.getWinRateTotal());
            System.out.println("\n");
            
        }
    }

    public void updateScreen() {
        int id = Entrada.input_int("Digite o ID da pessoa: ");
        FIDE_Player player = controleDeLista.read(id);
        if (player == null) {
            System.out.println("Não está cadastrado!");
        } else {
            
            System.out.println("\n");
            Saida.printInt("Id FIDE: ", player.getId());
            Saida.print("Nome do atleta: ", player.getName());
            Saida.print("Federação: ", player.getFederation());
            Saida.print("Ano de Nascimento ", dateTools.conversionDateToString(player.getBirthday()));
            Saida.printInt("Rating FIDE: ", player.getPointsFIDE());
            Saida.printInt("Partidas jogadas de brancas: ", player.getMatchsWhite());
            Saida.printInt("Partidas jogadas de negras: ", player.getMatchsBlack());
            Saida.printInt("Partidas jogadas: ", player.getMatchsTotal());
            Saida.printInt("Partidas ganhas de brancas: ", player.getVictoryWhite());
            Saida.printInt("Partidas ganhas de brancas: ", player.getVictoryBlack());
            Saida.printInt("Partidas ganhas no total: ", player.getVictoryTotal());
            Saida.printDouble("Aproveitamento de brancas: ", player.getWinRateWhite());
            Saida.printDouble("Aproveitamento de negras: ", player.getWinRateBlack());
            Saida.printDouble("Aproveitamento total: ", player.getWinRateTotal());
            System.out.println("\n");

            FIDE_Player atual = player;
            player.setId(id);
            player.setName(Entrada.input("Nome do jogador: "));
            player.setFederation(Entrada.input("Federação (País): "));
            player.setBirthday(dateTools.inputDate("Ano de nascimento: "));
            player.setPointsFIDE(Entrada.input_intPositivo("Pontos FIDE: "));
            player.setMatchsWhite(Entrada.input_intPositivo("Partidas jogadas de brancas: "));
            player.setMatchsBlack(Entrada.input_intPositivo("Partidas jogadas de pretas: "));
            player.setMatchsTotal(Processamento.sumOfTwoNumbersInt(player.getMatchsWhite(), player.getMatchsBlack()));
            player.setVictoryWhite(Entrada.input_intPositivo("Partidas ganhas de brancas: "));
            player.setVictoryBlack(Entrada.input_intPositivo("Partidas ganhas de pretas: "));
            player.setVictoryTotal(Processamento.sumOfTwoNumbersInt(player.getVictoryBlack(), player.getVictoryWhite()));
            player.setWinRateWhite(Processamento.winRate(player.getVictoryWhite(), player.getMatchsWhite()));
            player.setWinRateBlack(Processamento.winRate(player.getVictoryBlack(), player.getMatchsBlack()));
            player.setWinRateTotal(Processamento.winRate(player.getVictoryTotal(), player.getMatchsTotal()));
            controleDeLista.update(atual, player);
            System.out.println("\n");

            controleDeLista.update(atual, player);

            System.out.println("\n");
        }
    }

    public void deleteScreen() {
        int id = Entrada.input_int("Digite o ID da pessoa: ");
        FIDE_Player player = controleDeLista.read(id);
        if (player == null) {
            System.out.println("\nNão está cadastrado!\n");
        } else {
            
            System.out.println("\n");
            Saida.printInt("Id FIDE: ", player.getId());
            Saida.print("Nome do atleta: ", player.getName());
            Saida.print("Federação: ", player.getFederation());
            Saida.print("Ano de Nascimento ", dateTools.conversionDateToString(player.getBirthday()));
            Saida.printInt("Rating FIDE/: ", player.getPointsFIDE());
            Saida.printInt("Partidas jogadas de brancas: ", player.getMatchsWhite());
            Saida.printInt("Partidas jogadas de negras: ", player.getMatchsBlack());
            Saida.printInt("Partidas jogadas: ", player.getMatchsTotal());
            Saida.printInt("Partidas ganhas de brancas: ", player.getVictoryWhite());
            Saida.printInt("Partidas ganhas de brancas: ", player.getVictoryBlack());
            Saida.printInt("Partidas ganhas no total: ", player.getVictoryTotal());
            Saida.printDouble("Aproveitamento de brancas: ", player.getWinRateWhite());
            Saida.printDouble("Aproveitamento de negras: ", player.getWinRateBlack());
            Saida.printDouble("Aproveitamento total: ", player.getWinRateTotal());
            System.out.println("\n");
            
            if (Entrada.confirmation("Excluir cadastro? (Sim/Não): ")) {
                controleDeLista.delete(player);
            }

            System.out.println("\n");
        }
    }

    public void listScreen() {
        List<FIDE_Player> lp = controleDeLista.list();
        for (int i = 0; i < lp.size(); i++) {
            System.out.println(lp.get(i).dados());
        }
    }

    public UI() {
        if(!manipulaArquivo.existeOArquivo("FIDE.csv")){
            manipulaArquivo.criarArquivoVazio("FIDE.csv");
        }
        List<String> ls = manipulaArquivo.abrirArquivo("FIDE.csv");
        for (String lp : ls) {
            String[] aux = lp.split(";");
            FIDE_Player player = new FIDE_Player();
            player.setId(Integer.valueOf(aux[0]));
            player.setName(aux[1]);
            player.setFederation(aux[2]);
            player.setBirthday(dateTools.conversionStringToDate((aux[3])));
            player.setPointsFIDE(Integer.valueOf(aux[4]));
            player.setMatchsWhite(Integer.valueOf(aux[5]));
            player.setMatchsBlack(Integer.valueOf(aux[6]));
            player.setMatchsTotal(Integer.valueOf(aux[7]));
            player.setVictoryWhite(Integer.valueOf(aux[8]));
            player.setVictoryBlack(Integer.valueOf(aux[9]));
            player.setVictoryTotal(Integer.valueOf(aux[10]));
            player.setWinRateWhite(Processamento.conversionDouble(aux[11]));
            player.setWinRateBlack(Processamento.conversionDouble(aux[12]));
            player.setWinRateTotal(Processamento.conversionDouble(aux[13]));
            controleDeLista.create(player);
        }
        while (option != 9) {
            System.out.println("1 - Adicionar");
            System.out.println("2 - Buscar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Deletar");
            System.out.println("5 - Listar");
            System.out.println("9 - Sair\n");

            option = Entrada.input_int("Escolha uma opção: ");

            switch (option) {
                case 1:
                    createScreen();
                    break;
                case 2:
                    readScreen();
                    break;
                case 3:
                    updateScreen();
                    break;
                case 4:
                    deleteScreen();
                    break;
                case 5:
                    listScreen();
                    break;
                case 9:
                    ls = new ArrayList<>();
                    List<FIDE_Player> listaFIDE = controleDeLista.list();
                    for (int i = 0; i < listaFIDE.size(); i++) {
                        ls.add(listaFIDE.get(i).toString());
                    }
                    manipulaArquivo.salvarArquivo("FIDE.csv", ls);
                    break;
                default:
                    System.out.println("Opção inválida!!!");
            }

        }
        System.out.println("Programa Encerrado!");
    }

}
