import java.util.*;
import java.io.*;

public class Payroll extends Employee
{
    ArrayList <Employee> Employees = new ArrayList<Employee>();

    public void loadData()throws IOException
    {
        Scanner fileInput = new Scanner(new File("in.txt"));

        String empName;
        String empNum;
        String dep;
        String temp;
        char type;
        double hRate;
        double weeklyHrs;
        double ySal;
        int weeksSinceStart;
        double baseSal;
        double wSales;
        double salesLessWeekly;
        double commRate;

        while(fileInput.hasNextLine())
        {
            empName = fileInput.next();
            empNum = fileInput.next();
            dep = fileInput.next();
            temp = fileInput.next();
            type = temp.charAt(0);

               Employee e1 = new Employee(empName, empNum, dep, type);
                Employees.add(e1);
 

        }
        fileInput.close();
    }
}