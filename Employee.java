import java.io.*;

public class Employee extends Payroll
{
    protected String name;
    protected String empNo;
    protected String department;
    protected char type;

    public Employee()
    {
        name = "";
        empNo = "";
        department = "";
        type = ' ';
    }

    public Employee (String empName, String empNum, String dept, char t)
    {
        name = empName;
        empNo = empNum;
        department = dept;
        type = t;
    }

    public String getName()
    {
        return name;
    }

    public String getEmpNo()
    {
        return empNo;
    }

    public String getDepartment()
    {
        return department;
    }

    public char getType()
    {
        return type;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public void setEmpNo(String empNum)
    {
        this.empNo = empNum;
    }

    public void setDepartment (String dept)
    {
        department = dept;
    }

    public void setType(char t)
    {
        type = t;
    }

    public boolean equals (Employee e)
    {
        boolean ans;

        if (empNo.equals (e.empNo))
        {
            ans = true;
        }
        else
        {
            ans = false;
        }

        return ans;
    }

    public String toString ()
    {
        String output;

        output = ("Employee Name:  \t\t" + name + "\n");
        output = output + ("Employee Number: \t\t" + empNo + "\n");
        output = output + ("Department: \t\t" + department + "\n");
        output = output + ("Type: \t\t" + type + "\n");

        return output;
    }

    public void writeData ()
    {
        System.out.print("Employee Name: " + name + "\nEmployee Number: " + empNo + "\nDepartment: " + department + "\nType: " + type + "\n");
    }

    public boolean topSeller()
    {
        return false;
    }

    public double calcWeeklySalary()
    {
        double weeklySal = 0.0;
        return weeklySal;
    }

    public void setHrsWorked (double num)
    {
    }

    public double getWeekSales()
    {
        double wkSales = 0.0;
        return wkSales;
    }

    public double getYearSales()
    {
        double yrSales = 0.0;
        return yrSales;
    }

    public int getNumWeeks()
    {
        int wks = 0;
        return wks;
    }
    
    public void setYearSales(double amt) 
    {
    }

    public void setWeekSales(double amt) 
    {
    }

    public void setNumWeeks(int amt) 
    {
    }

}