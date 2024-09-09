import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.in;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myproject = new Scanner(in);
        System.out.println("whats your name?");
        String userName = myproject.nextLine();
        System.out.println("How old Are you");
        int age = myproject.nextInt();
        if (age >= 18 && age < 60) {
            System.out.println("Are you working? (Yes / No)");
            String answer = myproject.next();
            if (answer.equals("Yes")) {
                System.out.println("how much your salary?");
                double Salary = myproject.nextDouble();
            } else if (answer.equals("No")) {
                System.out.println("User isn't working");
            } else {
                System.out.println("Something went wrong");
            }
        } else if (age >= 60) {
            System.out.println("retired");

        } else {
            System.out.println("not working underage");
        }
    }
}


