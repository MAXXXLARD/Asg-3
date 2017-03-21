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

            if (type == 'H')
            {
                hRate = fileInput.nextDouble();
                weeklyHrs = fileInput.nextDouble();

                Employee e1 = new Employee(empName, empNum, dep, temp, type, hRate, weeklyHrs);
                Employees.add(e1);
            }
            else if (type == 'S')
            {

            }
            else if (type == 'C')
            {

            }
            else
            {

            }

        }
        fileInput.close();
    }
}