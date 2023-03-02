package com.Liskov;

class ElectricEngine implements Engine 

{
    public void start() 
    {
        System.out.println("Starting the electric motor");
    }

    public void stop() 
    {
        System.out.println("Stopping the electric motor");
    }
}
