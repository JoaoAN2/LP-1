package Main;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author JoaoAN
 */
class Saída {

    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
    Scanner teclado = new Scanner(System.in);

    public void print_double(String msg, double x) {
        String res = decimalFormat.format(x);
        System.out.println(msg + res);
    }

    public void print_bhaskara(double delta, double x1, double x2) {
        String res1 = decimalFormat.format(x1);
        String res2 = decimalFormat.format(x2);
        if (delta < 0) {
            System.out.println("Não existem resultado possível dentro dos reais! Delta < 0!");
        } else if (delta == 0) {
            System.out.println("Existe um resultado possível: S[" + res1 + "]");
        } else {
            System.out.println("Existe dois resultados possíveis: S[" + res1 + ", " + res2 + "]");
        }
    }

    public void print_int(String msg, int x) {
        System.out.println(msg + x);
    }

    public void pausa() {
        System.out.print("\nPressione [ENTER] para voltar ao menu!");
        teclado.nextLine();
    }
}
