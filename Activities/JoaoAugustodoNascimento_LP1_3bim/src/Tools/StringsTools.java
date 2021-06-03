package Tools;

/**
 *
 * @author JoaoAN
 */
public class StringsTools {

    public String firstLettertoUpperCase(String x) {
        String res = "";
        for (int i = 0; i < x.length(); i++) {
            if (i == 0) {
                res = res + x.toUpperCase().charAt(i);
            } else{
                res = res + x.toLowerCase().charAt(i);
            }
            
        }
        return res;
    }

}
