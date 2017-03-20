
public class Hourly extends Employee
{
    private double hPayRate;
    private int weeklyHours;
    
    public Hourly()
    {
        
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
}