import java.util.Scanner;
import java.io.*;

public class Client
{
    Scanner in = new Scanner(System.in);
    public static void main(String args[]) throws IOException
    {

        String option;
        Commission Comm = new Commission();
        Payroll p1 = new Payroll();

        // place here the code for the processing requirements
        showMenu();
        option = getInput();
        p1.loadData();

        while (!option.equalsIgnoreCase("Q")) {
            switch (option) {
                case "A":
                p1.newEmployee();
                break;
                case "I":

                break;
                case "D":

                break;
                case "S":

                break;

                case "T":
                Comm.topSeller();
                break;

                case "P":

                break;

                case "W":

                break;

            }
            Client.showMenu();
            option = Client.getInput();
        }
        System.out.println ("\nThank you for using the Payroll Processing System");

        // define necessary variables here

        // place here the code for the processing requirements

    }
    //   The Payroll processing menu
    public static void showMenu()
    {
        System.out.println("\nMENU:");
        System.out.println("A - Add a new employee");
        System.out.println("I - Print information of an individual employee");
        System.out.println("D - Remove an employee from payroll");
        System.out.println("S - calculate and print the weekly pay of an employee");
        System.out.println("P - prints salary report");
        System.out.println("W - End of week processing");
        System.out.println();
        System.out.println("Q - Quit the system\n");
    }

    public static String getInput() 
    {
        Scanner s = new Scanner(System.in);
        String chosen = s.nextLine();
        return chosen;
    }

    
}
