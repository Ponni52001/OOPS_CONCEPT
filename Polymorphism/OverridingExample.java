class Employee
{
    
    public void calculateSalary() 
    {
        System.out.println("Hi Your Salary has been credited based on your designation");
    }
    
}

class SoftwareDeveloper extends Employee
{
  
    public void calculateSalary() 
    {
        System.out.println("Hi Your Salary Amount 20000.00 Has Been Successfully Credited");
    }
    
}

class QualityAssuranceEngineer extends Employee
{

    public void calculateSalary()
    {
        System.out.println("Hi Your Salary Amount 15000.00 Has Been Successfully Credited");
    }
    
}

public class OverridingExample 
{
    public static void main(String[] args) 
    {
        
        Employee developer = new SoftwareDeveloper();
        Employee tester = new QualityAssuranceEngineer();
        developer.calculateSalary();
        tester.calculateSalary();
        
    }
    
}
