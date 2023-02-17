package Polymorphism;

class Stationery {
    void total(String str) {
        if(str=="Pen")
        System.out.println("Cost of pen is 10");
        else if(str=="Pencil")
            System.out.println("Cost of pencil is 5");
        else
            System.out.println("Cost of eraser is 4");

    }

    void total(String str1,String str2)
    {
        if(str1=="Pen"||str1=="Pencil" && str2=="Pencil"||str2=="Pen")
        System.out.println("Cost of pen and pencil is 15");
        else if(str1=="Eraser"||str1=="Pencil" && str2=="Pencil"||str2=="Eraser")
            System.out.println("Cost of pencil and Eraser is 9");
        else
            System.out.println("Cost of pen and Eraser is 14");

    }
    void total(String str1,String str2,String str3)
    {
        System.out.println("Cost of pen,pencil and eraser is 19");
    }
}


public class User {
    public static void main(String[] args) {
        Stationery user1 = new Stationery();
        user1.total("Pen");
        user1.total("Pencil");
        user1.total("Eraser");
        user1.total("Pen"," Pencil");
        user1.total("Pencil","Eraser");

        user1.total("Pen","Pencil","Eraser");


    }
}
