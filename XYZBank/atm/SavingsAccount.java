package com.atm;

import com.mainpackage.XYZAtm;

public class SavingsAccount implements Account
{
    //XYZ Bank
  double oldAccountBalance= CheckCardDetails.bankBalance;
  double accountBalance=oldAccountBalance;
  String cardNumber= CheckCardDetails.atmCardNumber;
  XYZAtm atm = new XYZAtm();
  public void changeBankBalance(double accountBalance)
  {
     atm.update(cardNumber,accountBalance,oldAccountBalance);
  }
    @Override
    public void withdraw(double amount) {

        double tax=calculateTax(amount);
        System.out.println("Enter the amount:");
        //temp
        if (accountBalance - amount - tax >= 100) {
            System.out.println("Charges USD " + tax);
            accountBalance = accountBalance - amount - tax;
            changeBankBalance(accountBalance);
            System.out.println("Balance USD " + accountBalance);
            System.out.println();

        }
        else{
            System.out.println("Insufficient balance!");
        }

    }

    @Override
    public void checkBalance() {
        System.out.println("USD "+accountBalance);
    }

    double calculateTax(double amount)
    {
        double percentage =0;
        if (amount <= 100) {
            percentage = 0.02 * 100;
        } else {
            percentage = 0.04 * 100;
        }
        return percentage;
    }


    public void swipe(double amount) {
        //balanceAmount store
        if (accountBalance - amount >= 100) {
            double cashBack = 0.01 * amount;
            System.out.println("Cashback USD " + cashBack);
            accountBalance = accountBalance - amount + cashBack;
            changeBankBalance(accountBalance);

            System.out.println("Balance USD " + accountBalance);
            System.out.println();

        }
        else {
            System.out.println("Insufficient Balance!");
        }

    }
   public void deposit(double amount)
    {
        accountBalance=accountBalance+amount;
        changeBankBalance(accountBalance);
        System.out.println("Balance USD "+accountBalance);

    }

}
