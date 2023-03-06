package com.Liskov1;

abstract class Engine 
{

    boolean running;

    public Engine(boolean running) 
    {
        this.running = running;
    }
    abstract void start();

    abstract void stop();
    public void isRunning()
    {
        if(running)
        {
            System.out.println("The engine is running");
        }
        System.out.println("The engine is not running");
    }

    //void fillfuel();


}

