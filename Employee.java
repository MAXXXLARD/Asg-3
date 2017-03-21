public class Employee
{

    protected String empName;
    protected String empNum;
    protected String department;
    protected char type;


    public Employee()
    {

    }


    public Employee (String eName, String eNum, String dept, char t)

    {
        empName = eName;
        empNum = eNum;
        department = dept;
        type = t;
    }

    public String getName()
    {
        return empName;
    }

    public String getNum()
    {
        return empNum;
    }
    
    public String getDep()
    {
        return department;
    }
        
    public char getType()
    {
        return type;
    }
    
    public void setName(String name)
    {
        empName = name;
    }

    public void setNum(String num)
    {
        empNum = num;
    }
    
    public void setDep(String dep)
    {
        department = dep;
    }

}
