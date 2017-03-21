
public class Salary extends Employee
{
    private double yearlySal;
    
    public Salary()
    {
        
    }
    
    public Salary(String name, String empNo, String dept, char t, double ySal)
    {
        super(name, empNo, dept, t);
        yearlySal = ySal;
    }
    
    public double getYearlySalary()
    {
        return yearlySal;
    }
    

    public void setYearlySalary(double yearSal)
    {
        yearlySal = yearSal;
    }
    
    public double calcYearlySalary()
    {
        double salFrac = 0.01923076923;
        double yearlySalary = 0.0;
        
        yearlySalary = yearlySal * salFrac;
        
        return yearlySalary;
    }

}