import javax.print.DocFlavor;
import javax.swing.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import com.google.gson.*;

public class Function {
    Exception e = new NumberFormatException();
    public boolean checkNum(String input){
        // check if input is a number
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0) {
                return true;
            }
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    public void dollarToNis(double dollar) {
        // convert dollar to nis
        double nis = dollar * 3.5;
        JOptionPane.showMessageDialog(null, dollar + " Dollar to NIS: " + nis + " NIS");
    }
    public void nisToDollar(double nis) {
        // convert nis to dollar
        double dollar = nis / 3.5;
        JOptionPane.showMessageDialog(null, nis + " NIS to Dollar: " + dollar + " Dollar");
    }
    public int getChoice1(Object[] option) {
        // get choice from option1
        return JOptionPane.showOptionDialog(null,"Choose which currency you wish to convert: ","Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[2]);
    }
    public int getChoice2(Object[] option) {
        // get choice from option2
        return JOptionPane.showOptionDialog(null,"What do you wish to do?","Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);
    }
}
