package ua.training;

import ua.training.Model.Model;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Tanya on 10.11.2017.
 */
public class View {

    // Resource Bundle Installation's
    public static final String MESSAGES_BUNDLE_NAME = "message";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                   new Locale("ua"));  // Ukrainian
//                   new Locale("en"));        // English


    /**
     *
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     *
     * @param message
     * @return
     */
    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public String getInputDate(String date) {
        String str = concatenationString( bundle.getString(date),
                GlobalConstant.SPACE_SING, GlobalConstant.EQUAL_SING);
        return str;
    }

    public String getInputLastName() {
        String str = concatenationString( bundle.getString( GlobalConstant.INPUT_LAST_NAME ),
                GlobalConstant.SPACE_SING, GlobalConstant.EQUAL_SING);
        return str;
    }

   public void printWrongDate(Model model,String wrongDateConst){
       printMessage(bundle.getString(wrongDateConst));
   }


}
