package Main;

import Tools.DateTools;
import java.text.DecimalFormat;
import java.util.Date;
/**
 *
 * @author jo_ao
 */
public class FIDE_Player {

    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
    DateTools dateTools = new DateTools();
    
    private int id;
    private String name;
    private String federation;
    private Date birthday;
    private int pointsFIDE;
    private int matchsWhite;    
    private int matchsBlack;    
    private int matchsTotal;    
    private int victoryWhite;    
    private int victoryBlack;
    private int victoryTotal;
    private double winRateWhite;
    private double winRateBlack;
    private double winRateTotal;

    public FIDE_Player() {
    }

    public FIDE_Player(int id, String name, String federation, Date birthday, int pointsFIDE, int matchsWhite, int matchsBlack, int matchsTotal, int victoryWhite, int victoryBlack, int victoryTotal, double winRateWhite, double winRateBlack, double winRateTotal) {
        this.id = id;
        this.name = name;
        this.federation = federation;
        this.birthday = birthday;
        this.pointsFIDE = pointsFIDE;
        this.matchsWhite = matchsWhite;
        this.matchsBlack = matchsBlack;
        this.matchsTotal = matchsTotal;
        this.victoryWhite = victoryWhite;
        this.victoryBlack = victoryBlack;
        this.victoryTotal = victoryTotal;
        this.winRateWhite = winRateWhite;
        this.winRateBlack = winRateBlack;
        this.winRateTotal = winRateTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFederation() {
        return federation;
    }

    public void setFederation(String federation) {
        this.federation = federation;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getPointsFIDE() {
        return pointsFIDE;
    }

    public void setPointsFIDE(int pointsFIDE) {
        this.pointsFIDE = pointsFIDE;
    }

    public int getMatchsWhite() {
        return matchsWhite;
    }

    public void setMatchsWhite(int matchsWhite) {
        this.matchsWhite = matchsWhite;
    }

    public int getMatchsBlack() {
        return matchsBlack;
    }

    public void setMatchsBlack(int matchsBlack) {
        this.matchsBlack = matchsBlack;
    }

    public int getMatchsTotal() {
        return matchsTotal;
    }

    public void setMatchsTotal(int matchsTotal) {
        this.matchsTotal = matchsTotal;
    }

    public int getVictoryWhite() {
        return victoryWhite;
    }

    public void setVictoryWhite(int victoryWhite) {
        this.victoryWhite = victoryWhite;
    }

    public int getVictoryBlack() {
        return victoryBlack;
    }

    public void setVictoryBlack(int victoryBlack) {
        this.victoryBlack = victoryBlack;
    }

    public int getVictoryTotal() {
        return victoryTotal;
    }

    public void setVictoryTotal(int victoryTotal) {
        this.victoryTotal = victoryTotal;
    }

    public double getWinRateWhite() {
        return winRateWhite;
    }

    public void setWinRateWhite(double averageWhite) {
        this.winRateWhite = averageWhite;
    }

    public double getWinRateBlack() {
        return winRateBlack;
    }

    public void setWinRateBlack(double averageBlack) {
        this.winRateBlack = averageBlack;
    }

    public double getWinRateTotal() {
        return winRateTotal;
    }

    public void setWinRateTotal(double averageTotal) {
        this.winRateTotal = averageTotal;
    }

    @Override
    public String toString() {
        return id + ";" + name + ";" + federation + ";" + birthday + ";" + pointsFIDE + ";" + matchsWhite + ";" + matchsBlack + ";" + matchsTotal + ";" + victoryWhite + ";" + victoryBlack + ";" + victoryTotal + ";" + decimalFormat.format(winRateWhite) + ";" + decimalFormat.format(winRateBlack) + ";" + decimalFormat.format(winRateTotal);
    }

    public String dados() {
        return "ID FIDE: " + id + "\nNome: " + name + "\nFederação: " + federation + "\nData de Nascimento: " + dateTools.conversionDateToString(birthday) 
                + "\nPontos FIDE: " + pointsFIDE + "\nPartidas de brancas: " + matchsWhite + "\nPartidas de pretas: " + matchsBlack 
                + "\nTotal de partidas: " + matchsTotal + "\nVitórias de brancas: " + victoryWhite + "\nVitória de pretas: "
                + victoryBlack + "\nTotal de vitórias: " + victoryTotal + "\nAproveitamento de brancas: " + decimalFormat.format(winRateWhite) + "\nAproveitamento de negras: " 
                + decimalFormat.format(winRateBlack) + "\nAproveitamento total: " + decimalFormat.format(winRateTotal) + "\n\n";
    }
    
    
}
