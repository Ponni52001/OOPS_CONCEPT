package com.atm;

import com.mainpackage.XYZAtm;

public class CurrentAccount implements Account

{
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
        double balanceAmount=accountBalance-amount;
        if(balanceAmount>=0)
        {
            accountBalance = balanceAmount;
            changeBankBalance(accountBalance);
            System.out.println("Balance USD " + accountBalance);
            System.out.println();
        }
    }

    @Override
    public void swipe(double amount) {
        double balanceAmount=accountBalance-amount;
        if (balanceAmount >=0) {
            double cashBack = 0.02 * amount;
            System.out.println("Cashback USD " + cashBack);
            accountBalance = balanceAmount  + cashBack;
            changeBankBalance(accountBalance);
            System.out.println("Balance USD " + accountBalance);
            System.out.println();
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount)
    {
        if(amount<100000) {
            accountBalance = accountBalance + amount;
            changeBankBalance(accountBalance);
            System.out.println("Balance USD " + accountBalance);
        }
        else{
            System.out.println("You are exceeding your daily limit of depositing money");
        }
    }
    public void checkBalance() {
        System.out.println("USD "+accountBalance);
    }
}