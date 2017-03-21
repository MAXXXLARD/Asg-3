
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
        super.getNum();
        super.getDep();
        super.getType();
    }
    
    public double getYearlySalary()
    {
        return yearlySal;
    }
    
<<<<<<< HEAD
=======
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
>>>>>>> Max-Branch
}