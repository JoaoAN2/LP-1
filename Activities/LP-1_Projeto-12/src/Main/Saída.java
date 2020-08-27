package Main;

import java.text.NumberFormat;

/**
 *
 * @author JoãoAN
 */
class Saída {
    
    public void print(double off, double product, double total){
        System.out.println("O valor do produto é de: " + NumberFormat.getCurrencyInstance().format(product));
        System.out.println("O valor do desconto é de: " + NumberFormat.getCurrencyInstance().format(off));
        System.out.println("O valor final do produto é de: " + NumberFormat.getCurrencyInstance().format(total));
    }
}