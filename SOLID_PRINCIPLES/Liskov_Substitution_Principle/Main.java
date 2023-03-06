package com.Liskov1;

public class Main 
{
    public static void main(String[] args)
    {
        Engine electricEngine = new ElectricEngine(false);
        electricEngine.start();
        electricEngine.stop();
        electricEngine.isRunning();
        //electricEngine.fillfuel();
    }
}
