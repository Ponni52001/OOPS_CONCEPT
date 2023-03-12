package com.atm;

import com.Validation.Validator;

import java.util.Scanner;

public class ATMTransaction {

    public static void useAtmCard(Account account)
    {
        while (true) {

            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. CheckBalance");
            System.out.println("4. Swipe-shopping");
            System.out.println("5. Exit");
            System.out.println();

           int option=Validator.validAtmTransactionInput();
            System.out.println(option);
            if(option==1)
            {
                System.out.println("Enter the Amount:");
                double amount =  Validator.validateCurrency();

                account.deposit(amount);
            }
              else if (option == 2)
                {
                    System.out.println("Enter the Amount:");
                    double amount =  Validator.validateCurrency();
                    if (amount % 5 == 0) {
                        account.withdraw(amount);
                    }
                    else {
                        System.out.println("Please enter an amount that is a multiple of USD 5.");
                    }
                }
              else if (option == 3)
              {

                account.checkBalance();
              }

                else if (option == 4)
                {
                    System.out.println("Enter the Amount:");
                    double amount =  Validator.validateCurrency();

                    account.swipe(amount);
                }


             else if(option==5){
               return;
            }

        }
    }
}

