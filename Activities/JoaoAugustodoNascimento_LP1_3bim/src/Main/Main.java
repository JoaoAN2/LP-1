package Main;

import Tools.DateTools;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author JoaoAN
 */
public class Main {

    /**
     *
     * Em um torneio de xadrez, esqueceram de instalar um programa de 
     * emparceiramento e não possuem internet. 
     * Crie um programa que faça o emparceiramento!
     * 
     **/
    public static void main(String[] args) {

        Entrada Entrada = new Entrada();
        Processamento Processamento = new Processamento();
        Saida Saida = new Saida();
        UI ui = new UI();
        DateTools dateTools = new DateTools();

        int nPlayers = Entrada.inputIntPositivo("Digite a quantidade de jogadores: ");
        int rodadas = Entrada.inputIntPositivo("Digite a quantidade de rodadas: ");
        String players[] = Entrada.addPlayers(nPlayers, "Digite o nome do jogador: ");
        String bye = "";
        double[] partialPoints = new double[players.length];
        double[] partialPointsVerifier = new double[players.length];
        double[] totalPoints = new double[players.length];
        String[] white;
        String[] black;
        Date begin = new Date();
        String[] roundsTime = new String[rodadas + 1];
        Arrays.sort(players);
        String[] organizationPlayer = new String[players.length];
        double[] organizationPoints = new double[players.length];
        roundsTime[0] = dateTools.conversionDateAndHoursToString(begin, " as ");
        for (int i = 0; i < rodadas; i++) {
            Processamento.rank(players, totalPoints);
            organizationPlayer = Processamento.getPlayerOrganization();
            organizationPoints = Processamento.getPointsOrganization();

            Processamento.pairing(players, totalPoints, rodadas);

            white = Processamento.getWhite();
            black = Processamento.getBlack();

            if (nPlayers % 2 == 1) {
                bye = organizationPlayer[organizationPlayer.length - 1];
                organizationPoints[organizationPoints.length - 1] = organizationPoints[organizationPoints.length - 1] + 1;
            }

            //UI
            ui.pairingScreen(white, black, partialPointsVerifier, bye);
            int choose;

            OUTER:
            while (true) {
                ui.choiceScreen();
                choose = Entrada.inputIntComParametros("Digite o que deseja: ", "Erro! Digite um valor válido!", 1, 3);
                switch (choose) {
                    case 1: {
                        ui.pairingScreen(white, black, partialPointsVerifier, bye);
                        int choiceOfTable = Entrada.inputIntComParametros("Digite a o número da mesa: ", "Erro! Digite um valor válido!", 1, players.length / 2);
                        choiceOfTable--;
                        if (partialPointsVerifier[choiceOfTable] == 1 || partialPointsVerifier[choiceOfTable] == 0.5 || partialPointsVerifier[players.length / 2 + choiceOfTable] == 1) {
                            System.out.println("Erro! Valor já foi inserido na partida!");
                        } else {
                            Processamento.addPoints(players, white, black, partialPoints, partialPointsVerifier, totalPoints, choiceOfTable);
                        }
                        break;
                    }
                    case 2: {
                        ui.pairingScreen(white, black, partialPointsVerifier, bye);
                        int choiceOfTable = Entrada.inputIntComParametros("Digite a o número da mesa: ", "Erro! Digite um valor válido!", 1, players.length / 2);
                        choiceOfTable--;
                        if (partialPointsVerifier[choiceOfTable] == 1 || partialPointsVerifier[choiceOfTable] == 0.5 || partialPointsVerifier[players.length / 2 + choiceOfTable] == 1) {
                            Processamento.removePoints(players, white, black, totalPoints, partialPoints, choiceOfTable);
                            Processamento.addPoints(players, white, black, partialPoints, partialPointsVerifier, totalPoints, choiceOfTable);
                        }
                        break;
                    }
                    case 3:
                        int auxa = 2;
                        for (int j = 0; j < white.length; j++) {
                            if (partialPointsVerifier[j] == 0 && partialPointsVerifier[white.length + j] == 0) {
                                System.out.println("Resultados incompletos!!!");
                                auxa = j;
                                break;
                            }
                        }
                        if (auxa != 2) {
                            break;
                        }
                        ui.pairingScreen(white, black, partialPointsVerifier, bye);
                        boolean confirmation = Entrada.confirmation("Confirma: ");
                        if (confirmation) {
                            Date aux = new Date();
                            int rodadaAtual = i + 1;
                            roundsTime[rodadaAtual] = dateTools.conversionDateAndHoursToString(aux, " as ");
                            System.out.println("Rodada " + rodadaAtual + " terminou no dia " + roundsTime[rodadaAtual]);
                            Processamento.rank(players, totalPoints);
                            partialPointsVerifier = new double[players.length];
                            break OUTER;
                        }
                        break;
                    default:
                        break;
                }
            }
        }

        Saida.results(organizationPlayer, organizationPoints);
        System.out.print("\nO torneio começou no dia " + roundsTime[0]);
        System.out.println("\nO torneio se encerrou no dia " + roundsTime[roundsTime.length - 1]);
    }

}
