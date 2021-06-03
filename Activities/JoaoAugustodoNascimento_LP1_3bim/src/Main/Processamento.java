package Main;

/**
 *
 * @author JoaoAN
 */
class Processamento {

    private Entrada Entrada = new Entrada();

    private double pointsOrganization[];
    private String playerOrganization[];
    private String[] playersProcess;
    private String[] whiteProcess;
    private String[] blackProcess;
    private double[] partialPointsProcess;
    private double[] partialPointsVerifierProcess;
    private double[] totalPointsProcess;

    public void rank(String[] players, double[] points) {
        pointsOrganization = points;
        playerOrganization = players;
        String player;
        double x;
        for (int i = 0; i < pointsOrganization.length; i++) {
            for (int j = i; j < pointsOrganization.length; j++) {
                if (pointsOrganization[i] < pointsOrganization[j]) {
                    x = pointsOrganization[j];
                    player = playerOrganization[j];
                    pointsOrganization[j] = pointsOrganization[i];
                    playerOrganization[j] = playerOrganization[i];
                    pointsOrganization[i] = x;
                    playerOrganization[i] = player;
                }
            }
        }
    }

    public void pairing(String[] players, double[] points, int rodada) {
        String[] white = new String[players.length / 2];
        String[] black = new String[players.length / 2];

        String[] auxListA = new String[players.length];
        String[] auxListB;

        auxListA[0] = players[0];

        int size = 1;

        int colorPlace = 0;

        for (int contPlayers = 1; contPlayers < players.length; contPlayers++) {
            if (points[contPlayers] == points[contPlayers - 1]) {

                auxListA[contPlayers] = players[contPlayers];

                size++;
            }
            if (points[contPlayers] != points[contPlayers - 1] || points[players.length - 1] == points[players.length - 2] && contPlayers == players.length - 1) {

                int place = 0;

                auxListB = new String[size];

                for (int i = 0; i < auxListA.length; i++) {
                    if (auxListA[i] != null) {
                        auxListB[place] = auxListA[i];
                        place++;
                    }
                }

                if (rodada % 2 == 0) {
                    for (int i = 0; i < auxListB.length / 2; i++) {
                        if (i % 2 == 0) {
                            white[colorPlace] = auxListB[auxListB.length / 2 + i];
                            black[colorPlace] = auxListB[i];
                        } else {
                            white[colorPlace] = auxListB[i];
                            black[colorPlace] = auxListB[auxListB.length / 2 + i];
                        }
                        colorPlace++;
                    }
                } else {
                    for (int i = 0; i < auxListB.length / 2; i++) {
                        if (i % 2 != 0) {
                            white[colorPlace] = auxListB[auxListB.length / 2 + i];
                            black[colorPlace] = auxListB[i];
                        } else {
                            white[colorPlace] = auxListB[i];
                            black[colorPlace] = auxListB[auxListB.length / 2 + i];
                        }
                        colorPlace++;
                    }
                }
                auxListA = new String[players.length];

                auxListA[contPlayers] = players[contPlayers];

                size = 1;

                if (auxListB.length % 2 != 0) {
                    auxListA[auxListB.length - 1] = auxListB[auxListB.length - 1];
                    size++;
                }
            }
            if (white[players.length / 2 - 1] == null) {
                white[players.length / 2 - 1] = players[players.length - 1];
                black[players.length / 2 - 1] = players[players.length - 2];
            }
        }
        whiteProcess = white;
        blackProcess = black;
    }

    public void addPoints(String[] players, String[] white, String[] black, double[] partialPoints, double[] partialPointsVerifier, double[] totalPoints, int choiceOfTable) {
        for (int j = 0; j < players.length; j++) {
            if (players[j].equals(white[choiceOfTable])) {
                partialPoints[j] = Entrada.inputResWhite(white[choiceOfTable], black[choiceOfTable]);
                partialPointsVerifier[choiceOfTable] = partialPoints[j];
                totalPoints[j] = totalPoints[j] + partialPoints[j];
                for (int l = 0; l < players.length; l++) {
                    if (players[l].equals(black[choiceOfTable])) {
                        partialPoints[l] = resBlack(partialPoints[j]);
                        partialPointsVerifier[players.length / 2 + choiceOfTable] = partialPoints[l];
                        totalPoints[l] = totalPoints[l] + partialPoints[l];
                    }
                }
            }
        }
    }

    public void removePoints(String[] players, String[] white, String[] black, double[] totalPoints, double[] partialPoints, int choiceOfTable) {
        for (int j = 0; j < players.length; j++) {
            if (players[j].equals(white[choiceOfTable])) {
                totalPoints[j] = totalPoints[j] - partialPoints[j];
                for (int l = 0; l < players.length; l++) {
                    if (players[l].equals(black[choiceOfTable])) {
                        totalPoints[l] = totalPoints[l] - partialPoints[l];
                    }
                }
            }
        }
    }

    public String bye(String[] players, String white[], String[] black) {
        for (int j = 0; j < players.length; j++) {
            for (int k = 0; k < white.length; k++) {
                if (players[j].equals(white[k]) || players[j].equals(black[k])) {
                    break;
                }
            }
            return players[j];
        }
        return null;
    }

    public double resBlack(double resWhite) {
        if (resWhite == 0) {
            return 1;
        } else if (resWhite == 0.5) {
            return 0.5;
        } else {
            return 0;
        }
    }

    public Entrada getEntrada() {
        return Entrada;
    }

    public double[] getPointsOrganization() {
        return pointsOrganization;
    }

    public String[] getPlayerOrganization() {
        return playerOrganization;
    }

    public String[] getPlayers() {
        return playersProcess;
    }

    public double[] getPartialPoints() {
        return partialPointsProcess;
    }

    public double[] getPartialPointsVerifier() {
        return partialPointsVerifierProcess;
    }

    public double[] getTotalPoints() {
        return totalPointsProcess;
    }

    public String[] getWhite() {
        return whiteProcess;
    }

    public String[] getBlack() {
        return blackProcess;
    }
}
