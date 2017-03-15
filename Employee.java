
public class Employee
{
<<<<<<< HEAD
    String empName="";
    String empNum="";
    String depart="";
    char type;
    
    public Employee ()
=======
    protected String empName;
    protected String empNum;
    protected String department;
    protected char type;
    
    public Employee()
>>>>>>> Max-Branch
    {
        
    }
    
<<<<<<< HEAD
    public Employee (String empName, String empNum, String depart, char type)
    {
        
    }
}
=======
    public Employee (String name, String eNum, String dep, char t)
    {
        empName = name;
        eNum = empNum;
        dep = department;
        t = type;
    }
    
    public String getName()
    {
        return empName;
    }
    
    public void setName(String name)
    {
        empName = name;
    }
}
>>>>>>> Max-Branch
