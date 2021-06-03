package Main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoaoAN
 */
public class ControleDeLista {
    
    private List<FIDE_Player> listaFIDE = new ArrayList<>();
    
    
    public void create(FIDE_Player player){
        listaFIDE.add(player);
    }
    
    public FIDE_Player read(int id){
        for (int i = 0; i<listaFIDE.size(); i++){
            if(id == listaFIDE.get(i).getId()){
                return listaFIDE.get(i);
            }
        }
        return null;
    }
    
    public void update(FIDE_Player atual, FIDE_Player newPlayer){
        listaFIDE.set(listaFIDE.indexOf(atual), newPlayer);
    }
    
    public void delete(FIDE_Player player){
        listaFIDE.remove(player);
    }
    
    public List list(){
        return listaFIDE;
    }
    
}
