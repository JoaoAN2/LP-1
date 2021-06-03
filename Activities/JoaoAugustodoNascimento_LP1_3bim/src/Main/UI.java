package Main;

/**
 *
 * @author JoaoAN
 */
public class UI {

    public void choiceScreen() {
        System.out.println("\nDigite: ");
        System.out.println("\n1 - Adicionar resultado");
        System.out.println("2 - Alterar resultado");
        System.out.println("3 - Confirmar resultados");
    }

    public void pairingScreen(String[] white, String[] black, double[] partialPointsVerifier, String bye) {
        System.out.println("\n       Brancas   X   Pretas\n");
        for (int i = 0; i < white.length; i++) {
            int mesa = i + 1;
            if (partialPointsVerifier[i] == 0 && partialPointsVerifier[white.length + i] == 0) {
                System.out.println("MESA " + mesa + ": " + white[i] + "   X   " + black[i]);
            } else {
                System.out.println("MESA " + mesa + ": " + white[i] + " " +partialPointsVerifier[i] +"   X   " + partialPointsVerifier[white.length + i] + " " + black[i]);
            }
        }
        if (!"".equals(bye)) {
            System.out.println(bye + " 1 X 0 BYE");
        }
    }
}
