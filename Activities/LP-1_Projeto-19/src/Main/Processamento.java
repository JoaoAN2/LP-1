package Main;

/**
 *
 * @author JoãoAN
 */
class Processamento {
    
    int candidato_1 = 0;
    int candidato_2 = 0;
    int candidato_3 = 0;
    int candidato_4 = 0;
    int voto_nulo = 0;
    int voto_branco = 0;
    
    public void contador(int x){
        switch(x){
            case 1:
                candidato_1 ++;
                break;
            case 2:
                candidato_2 ++;
                break;
            case 3:
                candidato_3 ++;
                break;
            case 4:
                candidato_4 ++;
                break;
            case 5:
                voto_nulo ++;
                break;
            case 6:
                voto_branco ++;
                break;
        }
    }
}
