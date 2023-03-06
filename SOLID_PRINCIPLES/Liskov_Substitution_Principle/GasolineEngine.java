package com.Liskov1;


class GasolineEngine extends Engine
{
    public GasolineEngine(boolean running) 
    {
        super(running);
    }

    public void start() 
    {
        System.out.println("Starting the Gasoline Engine");
    }

    public void stop() 
    {
        System.out.println("Stoping the Gasoline Engine");
    }
}
