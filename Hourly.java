
public class Hourly extends Employee
{
    private double hPayRate;
    private double weeklyHours;
    private double weeklySalary;

    public Hourly()
    {

    }

    public Hourly(String name, String empNo, String dept, char t, double hPay, double wHours)
    {
        super(name, empNo, dept, t);
        hPayRate = hPay;
        weeklyHours = wHours;
    }

    public double getHourlyPay()
    {
        return hPayRate;
    }

    public void setHourlyPay(double hPayR)
    {
        hPayRate = hPayR;
    }

    public double getWeeklyHours()
    {
        return weeklyHours;
    }

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

    public void writeData ()
    {
        super.writeData();
        System.out.print("Hourly pay rate: " + hPayRate + "\n" + "Weekly hours" + weeklyHours);
    }
}