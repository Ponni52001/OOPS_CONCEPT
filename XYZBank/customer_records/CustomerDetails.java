package com.customer_records;
import com.Validation.Validator;
import com.atm_card_generator.GenerateAtmCard;
import com.atm_card_generator.IndividualCustomerDetails;

import java.util.ArrayList;

public class CustomerDetails
{


 public  ArrayList<IndividualCustomerDetails> storeCustomerDetails(ArrayList<IndividualCustomerDetails> customersArraylist) {


     Boolean output = false;
     while (!output) {
         System.out.println("To create an ATM Card, please enter the following details:");
         IndividualCustomerDetails customer = new IndividualCustomerDetails();
         System.out.print("Enter your Name:");
         String customerName = Validator.validateName();
         customer.setName(customerName);

         System.out.print("Enter Your Age:");
         int customerAge = Validator.validateAge();
         customer.setAge(customerAge);

         System.out.print("Enter your account number:");
         long accountNumber = Validator.validateAccountNumber();
         customer.setAccountNumber(accountNumber);

         System.out.println("Enter your account balance:");
         double bankBalance = Validator.validateAccountBalance();
         customer.setBankBalance(bankBalance);

         System.out.println("The Customer details was added successfully!");
         ArrayList<String> cardDetails=new ArrayList<>();
         cardDetails= GenerateAtmCard.generateAtmCard();

         String  cardNumber=cardDetails.get(0);
         String cvv=cardDetails.get(1);
         String pin = cardDetails.get(2);

         customer.setCardNumber(cardNumber);
         customer.setCvv(cvv);
         customer.setPin(pin);

         customersArraylist.add(customer);


         output = true;
         printCustomerDetails(customersArraylist);

     }
     return customersArraylist;

 }
     public void printCustomerDetails(ArrayList<IndividualCustomerDetails> customersArraylist)
     {
         for (IndividualCustomerDetails customer : customersArraylist)
         {
             System.out.println(customer);
         }

     }
 }
