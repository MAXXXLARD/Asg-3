
public class Hourly extends Employee
{

    double payRate=0.00;
    double hoursWrk=0.00;
    private double hPayRate;
    private int weeklyHours;

    
    public Hourly()
    {
        
    }
    

    public Hourly(double pRate, double hWrk)
    {
        payRate=pRate;
        hoursWrk=hWrk;
    }

    public Hourly(double hPay, int wHours)
    {
        hPayRate = hPay;
        weeklyHours = wHours;
        super.getName();
    }
    
    public double getHourlyPay()
    {
        return hPayRate;
    }
    
    public double getWeeklyHours()
    {
        return weeklyHours;
    }
}

