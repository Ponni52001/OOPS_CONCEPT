package com.mainpackage;
import com.atm.CheckCardDetails;
import com.Validation.Validator;
import com.atm_card_generator.Customer;
import com.customer_records.CustomerDetails;

import java.util.ArrayList;
public class XYZAtm 
{
    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args)
    {

        System.out.println("Welcome to XYZ Bank!");
        System.out.println("------------------------------------------------------------------------------------------");
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Create a new ATM card.");
            System.out.println("2. Continue with the ATM card.");
            System.out.println("3. Exit.");

            int userInput = Validator.validateUserInput();

            if (userInput == 1)
            {
                CustomerDetails details = new CustomerDetails();
                details.storeCustomerDetails(customers);

            } else if (userInput == 2) {
                CheckCardDetails.checkUserDetails(customers);
            } else if(userInput==3){
                System.exit(0);
            }
        }
    }
        public static void update(String cardNumber,double amount,double oldAccountBalance)
        {
            for (Customer customer : customers)
            {
                if(cardNumber.equals(customer.getCardNumber()) && oldAccountBalance==(customer.getBankBalance()))
                {
                    customer.setBankBalance(amount);
                }
            }
        }
    }

