
public class Hourly extends Employee
{
    private double hPayRate;
<<<<<<< HEAD
    private int weeklyHours;

    
=======
    private double weeklyHours;
    private double weeklySalary;

>>>>>>> Max-Branch
    public Hourly()
    {

    }

    public Hourly(double hPay, int wHours)
    {
        hPayRate = hPay;
        weeklyHours = wHours;
        super.getName();
        super.getNum();
        super.getDep();
        super.getType();
    }

    public double getHourlyPay()
    {
        return hPayRate;
    }
<<<<<<< HEAD
    
=======

    public void setHourlyPay(double hPayR)
    {
        hPayRate = hPayR;
    }

>>>>>>> Max-Branch
    public double getWeeklyHours()
    {
        return weeklyHours;
    }
<<<<<<< HEAD
}

=======

    public void setWeeklyHours(int weeklyH)
    {
        weeklyHours = weeklyH;
    }

    public double calcWeeklySalary()
    {
        double otPay;
        double otPayRate = 1.5;
        weeklySalary = hPayRate * weeklyHours;

        if (weeklyHours > 40)
        {
            weeklyHours =- 40;
            otPay = weeklyHours * otPayRate;
            weeklySalary += otPay;
        }

        return weeklySalary;
    }
}
>>>>>>> Max-Branch
