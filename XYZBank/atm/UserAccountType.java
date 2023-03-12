package com.atm;

import java.util.Scanner;

public class UserAccountType {
    Scanner input = new Scanner(System.in);
    public void userAccount()
    {
        System.out.println("Choose your Account:");
        System.out.println("1.Savings Account");
        System.out.println("2.Checking Account");
        int userInput=input.nextInt();
        Account userAccount;
        if(userInput==1)
        {
          userAccount= new SavingsAccount();
        }
        else{
            userAccount=new CurrentAccount();
        }
         ATMTransaction.useAtmCard(userAccount);
    }
}
