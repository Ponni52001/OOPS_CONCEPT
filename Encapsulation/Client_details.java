package Encapsulation;

public class Client_details {
    private long acc_no;
    private String name;
    private int amount;

    private boolean checkAcc(long acc_no){
        if(acc_no<0){
            return false;
        }
        else{
            return true;
        }
    }
    void setAcc_no(long acc_no)
    {

        if(checkAcc(acc_no))
            this.acc_no = acc_no;
        else {
            System.out.println("wrong acc number!!");
            System.exit(0);
        }


    }
    long getAcc_no()
    {
        return acc_no;
    }

    private boolean checkName(String name)
    {
        if(name != null && !name.trim().isEmpty())
            return true;
        else
            return false;
    }
    void setName(String name)
    {
        if(checkName(name))
            this.name = name;
        else {
            System.out.println("Wrong user name");
            System.exit(0);
        }
    }
    String getName() {
        return name;
    }

    private boolean checkAmount(int amount)
    {
        if(amount>0)
            return true;
        else
            return false;
    }
    void setAmount(int amount) {
        if(checkAmount(amount))
            this.amount = amount;
        else
            System.out.println("wrong value");
    }
    int getAmount() {
        return amount;
    }


}
