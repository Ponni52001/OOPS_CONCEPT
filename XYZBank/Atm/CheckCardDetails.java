package com.atm;

import com.Validation.Validator;
import com.atm_card_generator.IndividualCustomerDetails;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckCardDetails {

    static double bankBalance;
    static String atmCardNumber;

    public static void checkUserDetails(ArrayList<IndividualCustomerDetails> customerArrayList) {
        System.out.println(customerArrayList);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your card Number");
        String cardNumber = input.nextLine();
        System.out.println("Enter your pin:");
        String pin = input.nextLine();
        Boolean checkDetails = Validator.validateUserDetails(cardNumber, pin);
        if (!(checkDetails)) {
            System.out.println("Invalid CardNumber or pin");
        } else {
            boolean output = false;
            for (IndividualCustomerDetails individualCustomerDetails : customerArrayList) {
                if (cardNumber.equals(individualCustomerDetails.getCardNumber()) && pin.equals(individualCustomerDetails.getPin())) {
                    output = true;
                    bankBalance = individualCustomerDetails.getBankBalance();
                    atmCardNumber = individualCustomerDetails.getCardNumber();
//                    System.out.println(bankBalance);
//                    System.out.println(cardNumber);
                    break;
                }
            }
            if (output) {
                System.out.println("Login successfull");
                UserAccountType accountType = new UserAccountType();
                accountType.userAccount();
            } else {
                System.out.println("Invalid pin or account number");
            }

        }


    }
}