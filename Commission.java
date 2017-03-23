import java.io.*;
import java.util.Scanner;

public class Commission extends Employee
{
    
    private int numWeeks;
    private double baseSal;
    private double weekSales;
    private double yearSales;
    private double commRate;
    
    public Commission()
    {
        numWeeks = 0;
        baseSal = 0.0;
        weekSales = 0.0;
        yearSales = 0.0;
        commRate = 0.0;
    }
    
    public Commission (String name, String empNo, String dept, char t, int num, double base, double w_amt, double y_amt, double rate)
    {
        super(name, empNo, dept, t);
        numWeeks = num;
        baseSal = base;
        weekSales = w_amt;
        yearSales = y_amt;
        commRate = rate;
    }
    
    public char getType()
    {
        return type;
    }
    
    public int getNumWeeks()
    {
        return numWeeks;
    }
    
    public double getBaseSal()
    {
        return baseSal;
    }
    
    public double getWeekSales()
    {
        return weekSales;
    }
    
    public double getYearSales()
    {
        return yearSales;
    }
    
    public double getCommRate()
    {
        return commRate;
    }
    
    public void setType (char type)
    {
        this.type = type;
    }
    
    public void setNumWeeks(int num)
    {
        numWeeks = num;
    }
    
    public void setBaseSal(double base)
    {
        baseSal = base;
    }
    
    public void setWeekSales(double amt)
    {
        weekSales = amt;
    }
    
    public void setYearSales(double amt)
    {
        yearSales = amt;
    }
    
    public void setCommRate(double rate)
    {
        commRate = rate;
    }
  
    public double calcWeeklySalary()
    {
        double weeklySal;
        
        //Scanner kb = new Scanner (System.in);
        
        //System.out.println ("Please enter the weekly Sales of " + getName() + " ");
        //weekSales = kb.nextDouble();
        weekSales = getWeekSales();
        
        weeklySal = baseSal + (commRate/100.0) * weekSales;
        
        return weeklySal;
    }
    
    
    public boolean topSeller()
    {
        boolean top = false;
        double aveSales;
        
        aveSales = (yearSales + weekSales) / (numWeeks + 1.0);
        
        if (aveSales >= 1500)
        {
            top = true;
        }
        return top;
        
    }
    
    public String toString()
    {
        String output;
        
        output = super.toString();
        
        output = output + ("Base Salary:\t\t\t" + baseSal + "\n");
        output = output + ("Number of Weeks worked: \t" + numWeeks + "\n");
        output = output + ("Weekly Sales: \t\t\t" + weekSales + "\n");
        output = output + ("Year to Date Sales: \t\t" + yearSales + "\n");
        output = output + ("Commission Rate:\t\t" + commRate);
        
        return output;
    }

    public void writeData ()
    {
        super.writeData();
        System.out.print("Number of weeks worked: " + numWeeks + "\nBase salary: " + baseSal + "\nWeekly Sales: " + weekSales + "\nYearly sales less weekly sales" + yearSales + "\nComission rate:  " + commRate);
        System.out.println();
    }
}