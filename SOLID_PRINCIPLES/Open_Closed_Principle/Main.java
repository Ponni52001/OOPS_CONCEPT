package com.OCP;


class OpenClosedPrinciple 
{
    public static void main(String[] args)
    {
        Employee ponni =new TemporaryEmployee("ponni","AB2344",20000);
        Employee swarna = new PermanentEmployee("Swarna","DDCC56",40000);

        ponni.calculateBonus();
        swarna.calculateBonus();

    }
}
