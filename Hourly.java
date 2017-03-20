
public class Hourly extends Employee
{
<<<<<<< HEAD
    double payRate=0.00;
    double hoursWrk=0.00;
=======
    private double hPayRate;
    private int weeklyHours;
>>>>>>> Max-Branch
    
    public Hourly()
    {
        
    }
    
<<<<<<< HEAD
    public Hourly(double pRate, double hWrk)
    {
        payRate=pRate;
        hoursWrk=hWrk;
    }
}
=======
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
>>>>>>> Max-Branch
