package com.atm_card_generator;
public class IndividualCustomerDetails {
    private String name;
    private int age;
    private long accountNumber;
    private double bankBalance;
    private String cardNumber;

    private String cvv;
    public String pin;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




//    public int getAge() {
//        return age;
//    }

    public void setAge(int age) {
        this.age = age;
    }



//    public long getAccountNumber() {
//        return accountNumber;
//    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }



    public  double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double Balance) {
        bankBalance = Balance;
    }




    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }



//    public String getCvv() {
//        return cvv;
//    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }


    public String toString()
    {
            System.out.println();
            return "Name: " + getName() + ", Age: " + age + ", Account Number: " + accountNumber + ", Bank Balance: " + bankBalance + ",ATM Card Number: " +cardNumber+", cvv: "+cvv + ",PIN: "+pin;
        }
    }

