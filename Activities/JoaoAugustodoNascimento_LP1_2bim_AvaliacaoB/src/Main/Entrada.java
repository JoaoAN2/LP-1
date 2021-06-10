package Main;

import java.util.Scanner;

/**
 *
 * @author JoaoAN
 */
class Entrada {

    Scanner teclado = new Scanner(System.in);

    public void escolha() {
        System.out.println("Digite 1 para Hipotenusa!");
        System.out.println("Digite 2 para Bhaskara!");
        System.out.println("Digite 3 para Distância de dois pontos!");
        System.out.println("Digite 4 para Menor ou Maior!");
        System.out.println("Digite 5 para Fibonacci!");
        System.out.println("Digite 6 para Sair do programa!");
    }

    public int input_escolha(String msg) {
        int x;
        while (true) {
            try {
                System.out.print(msg);
                x = teclado.nextInt();
                while (x < 1 || x > 6) {
                    System.out.println("Erro! Digite um valor inteiro de 1 à 6!");
                    System.out.print(msg);
                    x = teclado.nextInt();
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor inteiro de 1 à 6!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }

    public int input_int(String msg) {
        int x;
        while (true) {
            try {
                System.out.print(msg);
                x = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor inteiro!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }

    public int input_intPositivo(String msg) {
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

    public double input_doublePositivo(String msg) {
        double x;
        while (true) {
            try {
                System.out.print(msg);
                x = teclado.nextDouble();
                while (x <= 0) {
                    System.out.println("Erro! Digite um valor double positivo!");
                    System.out.print(msg);
                    x = teclado.nextDouble();
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor double positivo!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }

    public double input_double(String msg) {
        double x;
        while (true) {
            try {
                System.out.print(msg);
                x = teclado.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor double!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }

    public double input_doubleA(String msg) {
        double x;
        while (true) {
            try {
                System.out.print(msg);
                x = teclado.nextDouble();
                while (x == 0) {
                    System.out.println("Erro! o valor de \"a\" tem que ser diferente de 0!");
                    System.out.print(msg);
                    x = teclado.nextDouble();
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um double diferente de 0!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }

}
