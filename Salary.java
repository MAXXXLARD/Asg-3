
public class Salary extends Employee
{
    private double yearlySal;
    
    public Salary()
    {
        
    }
    
    public Salary(double ySal)
    {
        yearlySal = ySal;
        super.getName();
    }
    
    public double getYearlySalary()
    {
        return yearlySal;
    }
    
}