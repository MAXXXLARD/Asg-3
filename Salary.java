
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
    
    public double calcWeeklySalary()
    {
        final double salFrac = 0.01923076923;
        double weeklySalary = 0.0;
        
        weeklySalary = yearlySal * salFrac;
        
        return weeklySalary;
    }
    
    public void writeData ()
    {
        super.writeData();
        System.out.print("Yearly Salary: " + yearlySal + "\n");
    }
}