
public class Commission extends Employee
{
    private int totalWeeks;
    private double baseSal;
    private double weeklySales;
    private double salesLessWeekly;
    private double commissionRate;
    
    public Commission()
    {
        
    }
    
    public Commission(int tWeeks, double bSal, double wSales, double sLessWeekly, double cRate)
    {
        totalWeeks = tWeeks;
        baseSal = bSal;
        weeklySales = wSales;
        salesLessWeekly = sLessWeekly;
        commissionRate = cRate;
    }
}