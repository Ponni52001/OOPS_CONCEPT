package com.mainpackage;
import com.atm.CheckCardDetails;
import com.Validation.Validator;
import com.atm_card_generator.IndividualCustomerDetails;
import com.customer_records.CustomerDetails;

import java.util.ArrayList;
public class XYZAtm {
    static ArrayList<IndividualCustomerDetails> customersArraylist = new ArrayList<>();

    public static void main() {

        Validator validate = new Validator();
        System.out.println("Welcome to XYZ Bank!");
        System.out.println("------------------------------------------------------------------------------------------");
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Create a new ATM card.");
            System.out.println("2. Continue with the ATM card.");
            System.out.println("3. Exit.");

            int userInput = validate.validateNumberInput();

            if (userInput == 1) {
                CustomerDetails details = new CustomerDetails();
                details.storeCustomerDetails(customersArraylist);

            } else if (userInput == 2) {
                CheckCardDetails.checkUserDetails(customersArraylist);
            } else if(userInput==3){
                System.exit(0);
            }
        }
    }
        public void update(String cardNumber,double amount,double oldAccountBalance)
        {
            for (IndividualCustomerDetails individualCustomerDetails : customersArraylist)
            {
                if(cardNumber.equals(individualCustomerDetails.getCardNumber()) && oldAccountBalance==(individualCustomerDetails.getBankBalance()))
                {
                    individualCustomerDetails.setBankBalance(amount);
                }
            }
        }
    }

