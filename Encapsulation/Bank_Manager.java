package Encapsulation;

class BankManager
{
    public static void main(String[] args)
    {

        Client_details client1= new Client_details();

        client1.setAcc_no(23695971);
        client1.setName("Ponni");
        client1.setAmount(500000);

        System.out.println("Account No: "+client1.getAcc_no());
        System.out.println("Account Name: "+client1.getName());
        System.out.println("Account Balance: "+client1.getAmount());
    }


}
