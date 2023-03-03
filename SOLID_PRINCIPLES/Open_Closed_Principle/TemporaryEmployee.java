package com.OCP;

public class TemporaryEmployee extends Employee
{

    public TemporaryEmployee(String employeeName, String employeeID,double salary)
    {
        super(employeeName, employeeID,salary);
    }


    @Override
    public void calculateBonus() 
    {
        System.out.println("Hi "+employeeName+" Your bonus is "+5*(salary/100));
    }


}
