package Encapsulation;

class BankManager
{
    public static void main(String[] args)
    {

        ClientDetails client= new ClientDetails();

        client.setAccountNumber(852364971);
        client.setAccountName("Ponni");
        client.setAmount(500000);


        System.out.println("Account No: "+client.getAccountNumber());
        System.out.println("Account Name: "+client.getAccountName());
        System.out.println("Account Balance: "+client.getAmount());
    }


}
