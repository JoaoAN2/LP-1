package Main;

import java.util.Scanner;

/**
 *
 * @author JoaoAN
 */
public class Entrada {

    Scanner teclado = new Scanner(System.in);

    public String input(String msg) {
        String x;
        String y;
        System.out.print(msg);
        x = teclado.next();
        y = teclado.nextLine();
        return x + y;
    }

    public int input_int(String msg) {
        int x;
        while (true) {
            try {
                System.out.print(msg);
                x = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor int!");
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
                while(x < 0){
                    System.out.println("Erro! Digite um valor inteiro positivo!");
                    System.out.print(msg);
                    x = teclado.nextInt();
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor int positivo!");
                teclado = new Scanner(System.in);
            }
        }
        return x;
    }

    public int input_Victory(String msg, int match) {
        int x;
        while (true) {
            try {
                System.out.print(msg);
                x = teclado.nextInt();
                while(x < 0 || x > match){
                    System.out.println("Erro! Digite um valor inteiro positivo e menor que a quantidade de partidas jogadas com essa cor!");
                    System.out.print(msg);
                    x = teclado.nextInt();
                }
                break;
            } catch (Exception e) {
                System.out.println("Erro! Digite um valor int positivo!");
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

}
