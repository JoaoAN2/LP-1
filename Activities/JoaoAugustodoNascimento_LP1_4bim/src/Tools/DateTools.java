package Tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author JoaoAN
 * 
 */
public class DateTools {

    Scanner teclado = new Scanner(System.in);
    SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

    public DateTools() {
        SDF.setLenient(false);
    }

    public Date inputDate(String msg) {
        String x;
        Date y;
        while (true) {
            System.out.print(msg + " (dd/MM/yyyy): ");
            x = teclado.next();
            y = conversionStringToDate(x);
            while (y == null) {
                System.out.print("Erro! Digite uma data válida: ");
                x = teclado.next();
                y = conversionStringToDate(x);
            }
            break;
        }
        return y;
    }

    public String conversionDateToString(Date date) {
        try {
            return SDF.format(date);
        } catch (Exception e) {
            return null;
        }
    }

    public Date conversionStringToDate(String date) {
        try {
            return SDF.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

}
