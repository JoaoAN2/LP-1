package Main;

/**
 *
 * @author JoaoAN
 */
class Saida {
    
    
    
    public void results(String[] player, double[] points){
        System.out.println("\n");
        for (int i = 0; i < player.length; i++) {
            System.out.println(i+1 + "° Colocado: " + player[i] + " com " + points[i] + " pontos!");
        }
        System.out.println("\n");
    }
    
}

