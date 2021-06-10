package Main;

/**
 *
 * @author JoaoAN
 */
class Processamento {

    int maior = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;

    public double pitágoras(double c1, double c2) {
        return Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
    }

    public double delta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double bhaskaraA(double delta, double a, double b, double c) {
        double x1 = 0;
        if (delta == 0) {
            x1 = (-b) / (2 * a);
        }
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
        }
        return x1;
    }

    public double bhaskaraB(double delta, double a, double b, double c) {
        double x2 = 0;
        if (delta > 0) {
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
        return x2;
    }

    public double distânciaAB(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void contador(int n) {
        if (n > maior && n >= 0) {
            maior = n;
        }
        if (n < menor && n >= 0) {
            menor = n;
        }
    }

    public int resFibonacci(int cont) {
        //0,1,1,2,3,5,8
        int i_impar = 1;
        int i_par = 0;
        int i = 0;
        int res = 0;
        while (i < cont) {
            if (i % 2 == 0) {
                i_par = res + i_par;
                res = i_par;
            } else if (i % 2 == 1) {
                i_impar = res + i_impar;
                res = i_impar;
            }
            i++;
        }
        return res;
    }
}
