package com.Liskov1;

class ElectricEngine extends Engine 
{
    public ElectricEngine(boolean running) 
    {
        super(running);
    }

    public void start() 
    {
        System.out.println("Starting the electric motor");
    }

    public void stop() {
        System.out.println("Stopping the electric motor");
    }
}
