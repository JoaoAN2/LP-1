package Main;

import Tools.StringsTools;
import java.util.Scanner;

/**
 *
 * @author JoaoAN
 */
class Entrada {

    Scanner teclado = new Scanner(System.in);

    StringsTools stringsTools = new StringsTools();

    public int inputIntPositivo(String msg) {
        int x;
        while (true) {
            try {
                System.out.print(msg);
                x = teclado.nextInt();
                while (x < 0) {
                    System.out.println("Erro! Digite um valor inteiro positivo!");
                    System.out.print(msg);
                    x = teclado.nextInt();
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor inteiro positivo!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }

    public int inputIntComParametros(String msg, String msgErro, int minimo, int maximo) {
        int x;
        while (true) {
            try {
                System.out.print(msg);
                x = teclado.nextInt();
                while (x < minimo || x > maximo) {
                    System.out.println(msgErro);
                    System.out.print(msg);
                    x = teclado.nextInt();
                }
                break;
            } catch (Exception e) {
                System.out.println(msgErro);
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }

    public boolean confirmation(String msg) {
        System.out.print(msg);
        String x = teclado.next();
        char y = x.toUpperCase().charAt(0);
        return y == 'S' || y == 'Y';
    }

    public String[] addPlayers(int n, String msg) {
        String[] players = new String[n];
        String x;
        String y;
        for (int i = 0; i < n; i++) {
            System.out.print(msg);
            y = teclado.next();
            x = teclado.nextLine();
            players[i] = stringsTools.firstLettertoUpperCase(y + x);
        }
        return players;
    }

    public double inputResWhite(String white, String black) {
        double x;
        while (true) {
            try {
                System.out.print("\n     " + white + "   X   " + black + "\nRes: ");
                x = teclado.nextDouble();
                while (x != 0 && x != 1 && x != 0.5) {
                    System.out.println("Erro! Digite um valor válido!");
                    System.out.println(white + "   X   " + black);
                    x = teclado.nextDouble();
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor válido!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }

}
