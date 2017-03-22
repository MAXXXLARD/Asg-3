import java.util.*;
import java.io.*;

public class Payroll
{
    ArrayList <Employee> Employees = new ArrayList<Employee>();
    Scanner in = new Scanner(System.in);
    
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

    public void newEmployee()
    {
        char choice;
        String temp;
        int i = 1;
        String ans = "";

        String name = "";
        String empNo = "";
        String department = "";
        char type = ' ';

        double weeklyHours = 0.00;
        double hPayRate = 0.00;

        double yearlySal = 0.00;

        int numWeeks = 0;
        double baseSal = 0.0;
        double weekSales = 0.0;
        double yearSales = 0.0;
        double commRate = 0.0;

        while (i != 0) 
        {
            System.out.println("Enter the type of employee you wish to create (S, C or H)");
            temp = in.next();

            choice = temp.charAt(0);

            while (choice != 'S' && choice != 'C' && choice != 'H')
            {
                System.out.println("Invalid choice");
                System.out.println("Enter the type of employee you wish to create (S, C or H)");
                temp = in.next();
                choice = temp.charAt(0);
            }

            System.out.println("Enter the name of the employee");
            name = in.next();
            System.out.println("Enter the employee number");
            empNo = in.next();
            System.out.println("Enter the department");
            department = in.next();
            type = choice;

            if (choice == 'S')
            {
                System.out.println("Enter the yearly salary");
                yearlySal = in.nextDouble();

                Salary s1 = new Salary(name, empNo, department, type, yearlySal);
                Employees.add(s1);
            }
            else if (choice == 'C')
            {
                System.out.println("Enter the number of weeks worked");
                numWeeks = in.nextInt();
                System.out.println("Enter the base salary");
                baseSal = in.nextDouble();
                System.out.println("Enter the weekly sales");
                weekSales = in.nextDouble();
                System.out.println("Enter the yearly sales");
                yearSales = in.nextDouble();
                System.out.println("Enter the comission rate");
                commRate = in.nextDouble();

                Commission c1 = new Commission(name, empNo, department, type, numWeeks, baseSal, weekSales, yearSales, commRate);
                Employees.add(c1);
            }
            else if (choice == 'H')
            {
                System.out.println("Enter the pay rate");
                hPayRate = in.nextDouble();
                System.out.println("Enter weekly hours");
                weeklyHours = in.nextDouble();

                Hourly h1 = new Hourly(name, empNo, department, type, hPayRate, weeklyHours);
                Employees.add(h1);
            }

            System.out.println("Do you wish to create another employee?");
            ans=in.next();
            if (ans.equalsIgnoreCase("no"))
            {
                i--;
            }
        }
    }

    public Employee validateNum(String num)
    {
        Employee emp = null;
        int count = 0;
        
        while(count < Employees.size())
        {
            if (Employees.get(count).getEmpNo().equals(num))
            {
                emp = Employees.get(count);
            }
            count++;
        }
        
        return emp;
    }
    
    public void printInfo()
    {
        int count = 0;
        Employee empNo = null;
        
        System.out.println("Enter an employee number");
        String userStr = in.next();
        empNo = validateNum(userStr);
        System.out.println();
        
        if (empNo != null)
        {
            empNo.writeData();
        }
    }
}