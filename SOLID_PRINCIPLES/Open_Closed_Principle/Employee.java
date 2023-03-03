package com.OCP;

public abstract class Employee
{
  String employeeName;
  String employeeID;
  double salary;
  
  public  Employee(String employeeName,String employeeID,double salary)
  {
    
      this.employeeName=employeeName;
      this.employeeID=employeeID;
      this.salary=salary;
    
  }
  
  
  public void printSalary()
  {
      System.out.println("Your salary is "+salary);
  }
  
  
  public abstract void calculateBonus();
  
}
