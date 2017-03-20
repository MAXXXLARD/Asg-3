
public class Employee
{

    protected String empName;
    protected String empNum;
    protected String department;
    protected char type;

<<<<<<< HEAD
    public Employee ()
=======
    public Employee()
>>>>>>> Max-Branch
    {

    }

<<<<<<< HEAD

    public Employee (String name, String eNum, String dep, char t)
=======
    public Employee (String eName, String eNum, String dept, char t)
>>>>>>> Max-Branch
    {
        empName = eName;
        eNum = empNum;
        dept = department;
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
<<<<<<< HEAD
}

=======

    public String getNum()
    {
        return empNum;
    }

    public void setNum(String num)
    {
        empNum = num;
    }

    public String getDep()
    {
        return department;
    }
    
    public void setDep(String dep)
    {
        department = dep;
    }
    
    public char getType()
    {
        return type;
    }
}
>>>>>>> Max-Branch
