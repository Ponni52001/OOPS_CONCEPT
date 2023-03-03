package com.OCP;

public class PermanentEmployee extends Employee
{

    public PermanentEmployee(String employeeName, String employeeID, double salary) 
    {
        super(employeeName, employeeID,salary);
    }

    @Override
    public void calculateBonus()
    {
        System.out.println("Hi " +employeeName+" Your bonus is "+10*(salary/100));
    }



}
