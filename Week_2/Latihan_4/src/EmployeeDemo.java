class Employee
{
    public String name;
    public int salary;
    public static int count=0;
    //creating a constructor of the class
    Employee(String name, int salary)
    {
        this.name= name;
        this.salary= salary;
//increments the variable count by 1  
        count++;
    }
}
public class EmployeeDemo
{
    public static void main(String[] args)
    {
//creating objects      
        Employee emp1 = new Employee("John", 20000);
        Employee emp2 = new Employee("Tom", 60000);
        Employee emp3 = new Employee("Andrew",29000);
        Employee emp4 = new Employee("Mathew", 50000);
//prints total number of objects  
        System.out.println ("There are " + Employee.count + " objects in this class.");
    }
}  