package ua.training;

import ua.training.Controller.Controller;
import ua.training.Model.Model;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Tanya on 10.11.2017.
 */
public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Pattern pattern=Pattern.compile("^[A-Я][a-я]");
//
//        System.out.println("Input");
//        while( !pattern.matcher(sc.next()).matches() ) {}
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
