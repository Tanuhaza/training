package ua.training.Controller;

import ua.training.GlobalConstant;
import ua.training.Model.Model;
import ua.training.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 *
 */
public class Controller {
    private Model model;
    private View  view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        Pattern patternFirstLastName = Pattern.compile("^[A-Я][a-я]+");
        Pattern patternPhone=Pattern.compile("(\\d{3})-(\\d{3}-\\d\\d-\\d\\d)");
        model.setFirstName(inputDateWithScanner(sc,patternFirstLastName, GlobalConstant.INPUT_FIRST_NAME,GlobalConstant.WRONG_INPUT_FIRST_DATA));
        model.setLastName(inputDateWithScanner(sc,patternFirstLastName,GlobalConstant.INPUT_LAST_NAME,GlobalConstant.WRONG_INPUT_LAST_DATA));
        model.setPhone(inputDateWithScanner(sc,patternPhone,GlobalConstant.INPUT_PHONE,GlobalConstant.WRONG_INPUT_PHONE));
        System.out.println(model.getFirstName()+" "+model.getLastName()+" "+model.getPhone());
    }

    // The Utility methods

    /**
     *
     * @param sc
     * @return
     */
    private String inputDateWithScanner(Scanner sc,Pattern pattern, String inputConst, String wrongDate) {
        String inputDate;
        // check firstName
        view.printMessage(view.getInputDate(inputConst));
        while (!pattern.matcher(inputDate=sc.next()).matches()) {
            view.printWrongDate(model,wrongDate);
        }
    return inputDate;
    }

//    private String inputLastNameWithScanner(Scanner sc) {
//        Pattern pattern = Pattern.compile("^[A-Я][a-я]+");
//        String lastName;
//        // check lastName
//        view.printMessage(view.getInputLastName());
//        while (!pattern.matcher(lastName=sc.next()).matches()) {
//            view.printWrongDate(model,);
//        }
//        return lastName;
//    }
}
