package com.SRP;

class Main{
    public static void main(String[] args) {
        SingleResponsibility customer1= new SingleResponsibility();
        customer1.setCustomerName("Ponni");
        customer1.setCustomerNumber(1234567891);
        customer1.setMailID("ponni@gmail.com");
        System.out.println(customer1.getCustomerName());
        System.out.println(customer1.getCustomerNumber());
        System.out.println(customer1.getMailID());
    }
}
