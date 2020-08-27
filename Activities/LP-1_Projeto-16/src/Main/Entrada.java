package Main;

import java.util.Scanner;

/**
 *
 * @author JoãoAN
 */
class Entrada {

    Scanner teclado = new Scanner(System.in);

    public int aulas(String msg) {
        int x = 0;
        while (x <= 0) {
            try {
                System.out.print(msg);
                x = teclado.nextInt();
                if (x <= 0) {
                    System.out.println("Erro! Digite um valor inteiro positivo!");
                }
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor inteiro positivo!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }

    public int faltas(String msg, int aulas) {
        int x = -1;
        while (x < 0 || x > aulas) {
            try {
                System.out.print(msg);
                x = teclado.nextInt();
                if (x < 0 || x > aulas) {
                    System.out.println("Erro! Digite um valor inteiro maior ou igual a zero e menor do que as aulas (" + aulas + ")!");
                }
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor inteiro positivo menor do que as aulas (" + aulas + ")!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }

    public double notas(String msg) {
        double x = 11;
        while (x < 0 || x > 10) {
            try {
                System.out.print(msg);
                x = teclado.nextDouble();
                if (x < 0 || x > 10) {
                    System.out.println("Erro! Digite um valor double entre 0 e 10!");
                }
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor double entre 0 e 10!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }
}
