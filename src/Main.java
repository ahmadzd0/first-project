import java.util.Scanner;

import static java.lang.System.in;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myproject = new Scanner(System.in);


        System.out.println("whats your name?");
        String userName = myproject.nextLine();
        System.out.println("How old Are you");
        int age = myproject.nextInt();
        if (age >= 18) {
            System.out.println("Are you working?");
            System.out.println("how much is your salary?");
            double salary = myproject.nextDouble();
        }

             else
                System.out.println("not working underage");
        }
    }


