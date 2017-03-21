import java.util.*;
import java.io.*;

public class Payroll
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
                
                Hourly h1 = new Hourly(empName, empNum, dep, type, hRate, weeklyHrs);
                Employees.add(h1);
            }
            else if(type == 'S')
            {
                ySal = fileInput.nextDouble();
                
                Salary s1 = new Salary(empName, empNum, dep, type, ySal);
                Employees.add(s1);
            }
            else if(type == 'C')
            {
                weeksSinceStart = fileInput.nextInt();
                baseSal = fileInput.nextDouble();
                wSales = fileInput.nextDouble();
                salesLessWeekly = fileInput.nextDouble();
                commRate = fileInput.nextDouble();
                
                Commission c1 = new Commission(empName, empNum, dep, type, weeksSinceStart, baseSal, wSales, salesLessWeekly, commRate);
                Employees.add(c1);
            }
            else
            {
                
            }
        }
        fileInput.close();
    }
}