package Encapsulation;

public class ClientDetails 
{
    private long accountNumber;
    private String accountName;
    private double amount;

    private boolean checkAccountNumber(long accountNumber)
    {
        if(accountNumber<0)
        {
            return false;
        }
        else{
            return true;
        }
    }



    void setAccountNumber(long accountNumber)
    {

        if(checkAccountNumber(accountNumber))
            this.accountNumber = accountNumber;
        else {
            System.out.println("Invalid account number!!");
            System.exit(0);
        }

    }


    long getAccountNumber()
    {
        return accountNumber;
    }


    private boolean checkName(String name)
    {
        if(name != null && !name.trim().isEmpty())
            return true;
        else
            return false;
    }


    void setAccountName(String name)
    {
        if(checkName(name))
            this.accountName = name;
        else
        {
            System.out.println("Invalid Account Name");
            System.exit(0);
        }
    }


    String getAccountName()
    {
        return accountName;
    }


    private boolean checkAmount(double amount)
    {
        if(amount>0)
            return true;
        else
            return false;
    }


    void setAmount(double amount)
    {
        if(checkAmount(amount))
            this.amount = amount;
        else
            System.out.println("Invalid Amount");
    }


    double getAmount()
    {
        return amount;
    }


}
